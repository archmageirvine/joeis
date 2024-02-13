package irvine.factor.prime;

import java.io.Serializable;

import irvine.math.z.Z;

/**
 * Provides methods for generation of small prime numbers.
 *
 * The class is implemented as a fast version of Eratosthenes' sieve
 * with additional memory usage improvements. It searches only for
 * odd primes :-).
 *
 * @author Sean A. Irvine
 */
public final class Feral implements Prime, Serializable {

  /** Maximum value handled by direct lookup. */
  static final long N = 0x8000000L;
  private static final long NSQ = N * N;     // square of sieve size
  private static final int[] S;             // array to store the primes

  static {
    /* prepare the array */
    final int k = (int) (N >>> 6) + 1;
    S = new int[k + 7]; // +7 copes with overrun from special loops

    /* handle the case p = 3, except the first 32 bits */
    for (int i = 1; i <= k;) {
      S[i++] = 0x24924924;
      S[i++] = 0x92492492;
      S[i++] = 0x49249249;
    }

    /* handle the case p = 5, except the first 32 bits */
    for (int i = 1; i <= k;) {
      S[i++] |= 0x84210842;
      S[i++] |= 0x10842108;
      S[i++] |= 0x42108421;
      S[i++] |= 0x08421084;
      S[i++] |= 0x21084210;
    }

    /* handle the case p = 7, except the first 32 bits */
    for (int i = 1; i <= k;) {
      S[i++] |= 0x02040810;
      S[i++] |= 0x20408102;
      S[i++] |= 0x04081020;
      S[i++] |= 0x40810204;
      S[i++] |= 0x08102040;
      S[i++] |= 0x81020408;
      S[i++] |= 0x10204081;
    }

    /* other small primes could be handled in the same manner */

    /* set the lowest bits */
    S[0] = 0x892CD2D9;

    int p = 11; // current prime
    int a = 26; // bit position within byte
    int b = 0;  // current int position
    long c;
    int cc;

    while ((c = (long) p * (long) p) <= N) {
      /* pass up the array setting bits of composites */
      cc = (int) (c >>> 1);
      int j = cc >>> 5;
      int i = cc & 0x1F;
      if (p < 32) {
        while (j <= k) {
          S[j] |= 0x80000000 >>> i;
          i += p;
          if (i > 0x1F) {
            i &= 0x1F;
            ++j;
          }
        }
      } else if (p < 64) {
        while (j <= k) {
          S[j] |= 0x80000000 >>> i;
          i += p;
          if (i > 0x3F) {
            i &= 0x3F;
            j += 2;
          } else {
            i &= 0x1F;
            ++j;
          }
        }
      } else if (p < 96) {
        while (j <= k) {
          S[j] |= 0x80000000 >>> i;
          i += p;
          i &= 0x3F;
          j += 2;
          if (i > 0x1F) {
            i &= 0x1F;
            ++j;
          }
        }
      } else {
        while (j <= k) {
          S[j] |= 0x80000000 >>> i;
          i += p;
          while (i > 0x1FF) {
            i -= 0x200;
            j += 16;
          }
          if (i > 0xFF) {
            i &= 0xFF;
            j += 8;
          }
          if (i > 0x7F) {
            i &= 0x7F;
            j += 4;
          }
          if (i > 0x3F) {
            i &= 0x3F;
            j += 2;
          }
          if (i > 0x1F) {
            i &= 0x1F;
            ++j;
          }
        }
      }
      /* find next prime */
      j = S[b];
      do {
        p += 2;
        if (--a < 0) {
          a += 32;
          while ((j = S[++b]) == 0xFFFFFFFF) {
            p += 64;
          }
        }
      } while ((j & (1 << a)) != 0);
    }
  }

  /* Remember the largest prime in the table. */
  private final long mNP = prevPrime(N);

  private static final int[] MASKS = {
    1 << 31, 1 << 30, 1 << 29, 1 << 28, 1 << 27, 1 << 26, 1 << 25, 1 << 24,
    1 << 23, 1 << 22, 1 << 21, 1 << 20, 1 << 19, 1 << 18, 1 << 17, 1 << 16,
    1 << 15, 1 << 14, 1 << 13, 1 << 12, 1 << 11, 1 << 10, 1 <<  9, 1 <<  8,
    1 <<  7, 1 <<  6, 1 <<  5, 1 <<  4, 1 <<  3, 1 <<  2, 1 <<  1, 1 <<  0
  };

  boolean isSmallPrime(final long n) {
    final long m = n >>> 1;
    return (S[(int) (m >>> 5)] & MASKS[(int) m & 0x1F]) == 0;
  }

  @Override
  public boolean isPrime(final long n) {
    if (n <= 2) {
      return n == 2;
    }
    if ((n & 1) == 0) {
      return false;
    }
    // see if table lookup will suffice
    if (n < N) {
      return isSmallPrime(n);
    }

    // see if table is large enough to guarantee a result
    if (n < NSQ) {
      // set state to 1
      int a = 0x80000000;
      int b = 0;
      int p = 1;
      final int limit = (int) Math.floor(Math.sqrt(n));

      while (p < limit) {
        p += 2;
        a >>>= 1;
        if (a == 0) {
          b += 1;
          a = 0x80000000;
        }
        if ((S[b] & a) == 0 && n % p == 0) {
          return false;
        }
      }
      return true; // exhuasted list of primes
    }

    // deal with the remaining cases (n >= NSQ)
    int a = 0x80000000;
    int b = 0;
    int p = 1;
    final long limit = (int) Math.floor(Math.sqrt(n));
    final int slen = S.length;

    // try and use the table
    while (true) {
      p += 2;
      a >>>= 1;
      if (a == 0) {
        b += 1;
        if (b == slen) {
          break; // table exhausted
        }
        a = 0x80000000;
      }
      if ((S[b] & a) == 0 && n % p == 0) {
        return false;
      }
    }

    // keep going with the odd numbers above the table
    long pp = N + 1;
    while (pp < limit) {
      if (n % pp == 0) {
        return false;
      }
      pp += 2;
    }
    return true;
  }

  @Override
  public boolean isPrime(final Z n) {
    return isPrime(n.longValueExact());
  }

  @Override
  public long nextPrime(long n) {
    if (n < 2L) {
      return 2L;
    }
    if (n >= mNP) {
      return 0; // out of range
    }
    ++n;
    n |= 1;
    // n is now odd
    final int p = (int) (n >> 1);
    int b = p >>> 5;
    int a = MASKS[p & 0x1F];

    while (true) {
      if ((S[b] & a) == 0) {
        return n;
      }
      n += 2;
      a >>>= 1;
      if (a == 0) {
        b += 1;
        a = 0x80000000;
      }
    }
  }

  @Override
  public Z nextPrime(final Z n) {
    return Z.valueOf(nextPrime(n.longValueExact()));
  }

  @Override
  public long prevPrime(long n) {
    if (n <= 2L) {
      return 0L;
    }
    if (n > N) {
      return 0L; // out of range
    }
    if (n == 3) {
      return 2L;
    }
    n -= 2;
    n |= 1;
    // n is now odd
    final int p = (int) (n >>> 1);
    int b = p >>> 5;
    int a = MASKS[p & 0x1F];

    while (true) {
      if ((S[b] & a) == 0) {
        return n;
      }
      n -= 2;
      a <<= 1;
      if (a == 0) {
        b -= 1;
        a = 0x1;
      }
    }
  }

  @Override
  public Z prevPrime(final Z n) {
    return Z.valueOf(prevPrime(n.longValueExact()));
  }
}
