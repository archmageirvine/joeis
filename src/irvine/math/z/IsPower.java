package irvine.math.z;

import irvine.factor.prime.Fast;
import irvine.math.IntegerUtils;
import irvine.math.LongUtils;

/**
 * Test if a number is a perfect power.
 * @author Sean A. Irvine
 */
final class IsPower {

  private IsPower() { }

  /**
   * Test if an integer is a perfect power.  If it is then, returns the base of
   * the power and sets the auxiliary to the relevant exponent.  Otherwise,
   * returns null and an auxiliary of 1.  Returns null for all inputs &lt;= 1.
   * @param n number to test
   * @return x such that <code>x^a=n</code> or null if no such x exists.
   */
  static Z isPower(final Z n) {
    int r = 1;
    if (n.compareTo(Z.ONE) <= 0) {
      n.mAuxiliary = r;
      return null;
    }
    Z a = n;
    // Handle squarings
    while ((a.mValue[0] & 7) == 1 || (a.mValue[0] & 1) == 0) {
      final Z[] t = Sqrt.sqrt(a);
      if (a.auxiliary() != 1) {
        break;
      }
      r <<= 1;
      a = t[0];
    }
    final Fast prime = new Fast();
    int l = a.bitLength();
    int c;
    int p = 2;
    Z t;
    outer:
    while (true) {
      p = (int) prime.nextPrime(p);
      if (p * (IntegerUtils.log2(p) - 1) > l) {
        break;
      }
      while (true) {
        if (a.mod(p) != 0) {
          if (p < Z.BASE_ROOT) {
            c = p * p;
            if (LongUtils.modPow(a.mod(c), p - 1, c) != 1) {
              continue outer;
            }
          }
        } else if (p < Z.BASE_ROOT && a.mod((long) p * p) != 0) {
          n.mAuxiliary = r;
          return r < 2 ? null : a;
        }
        int q, j;
        for (j = 2; ; j += 2) {
          q = j * p + 1;
          if (q % 3 != 0) {
            c = 5;
            while (c * c <= q && q % c != 0) {
              c += 2;
              if (c * c > q || q % c == 0) {
                break;
              }
              c += 4;
            }
            if (c * c > q) {
              break;
            }
          }
        }
        // q is prime
        c = (int) a.mod(q);
        if (c > 1 && IntegerUtils.modPow(c, j, q) != 1) {
          continue outer;
        }
        t = Root.root(a, p);
        if (a.auxiliary() == 1) {
          r *= p;
          a = t;
          l = a.bitLength();
        } else {
          break;
        }
      }
      if (t.compareTo(p) <= 0) {
        p = t.intValue() - 1;
        break;
      }
    }
    // Stage 2
    l = a.mSign;
    for (; p > 1; --p) {
      // make sure p is not a power
      if (p > 3) {
        int j;
        for (int i = 2; (j = i * i) <= p; ++i) {
          while (j < p) {
            j *= i;
          }
          if (j == p) {
            break;
          }
        }
        if (j == p) {
          continue;
        }
      }
      if (a.mod(p) != 0) {
        continue;
      }
      c = p;
      int e = 1;
      if (p < Z.BASE_ROOT && a.mSign > 1) {
        c = p * p;
        e = 2;
        if (a.mod(c) != 0) {
          n.mAuxiliary = r;
          return r < 2 ? null : a;
        }
        while (IntegerUtils.log2(c) + IntegerUtils.log2(p) < Z.BASE_BITS) {
          c *= p;
          ++e;
        }
        if (c > p * p && a.mod(c) != 0) {
          continue;
        }
      }
      t = Z.valueOf(c);
      while (t.mSign < l) {
        t = t.multiply(p);
        ++e;
      }
      while ((c = t.compareTo(a)) < 0) {
        t = t.multiply(p);
        ++e;
      }
      if (c == 0) {
        n.mAuxiliary = r < 2 ? e : (long) r * e;
        return n.mAuxiliary <= 1 ? null : Z.valueOf(p);
      }
    }
    n.mAuxiliary = r;
    return r < 2 ? null : a;
  }

}
