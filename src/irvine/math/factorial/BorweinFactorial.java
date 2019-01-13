package irvine.math.factorial;

import irvine.factor.prime.Fast;
import irvine.factor.prime.Prime;
import irvine.math.IntegerUtils;
import irvine.math.z.Z;

/**
 * Compute factorial by method of Borwein.
 *
 * @author Sean A. Irvine
 */
public class BorweinFactorial implements Factorial {

  private static final int SMALL_LIMIT = 20;
  private static final Z[] SMALL;
  static {
    SMALL = new Z[SMALL_LIMIT];
    Z z = Z.ONE;
    SMALL[0] = z;
    for (int i = 1; i < SMALL.length; ++i) {
      z = z.multiply(Z.valueOf(i));
      SMALL[i] = z;
    }
  }

  private static final Prime PRIME = new Fast();

  private static Z recProduct(final long[] al, final int i, final int j) {
    if (i == j) {
      return Z.valueOf(al[i]);
    } else {
      final int k = (i + j) >>> 1;
      return recProduct(al, i, k).multiply(recProduct(al, k + 1, j));
    }
  }

  private static Z product(final int[] ai, final int i, final int j) {
    if (j < 3) {
      if (j == 0) {
        return Z.ONE;
      }
      if (j == 1) {
        return Z.valueOf(ai[i]);
      } else {
        return Z.valueOf((long) ai[i] * (long) ai[i + 1]);
      }
    }
    final long[] al = new long[(j + 1) >>> 1];
    int l = (i + j) - 1;
    int k = i;
    int i1 = 0;
    while (k < l) {
      long l1 = (long) ai[k++] * (long) ai[l--];
      if (k < l && l1 < 0x7FFFFFFFL) {
        l1 *= ai[k++];
      }
      al[i1++] = l1;
    }
    if (k == l) {
      al[i1++] = ai[l];
    }
    --i1;
    if (i1 < 2) {
      if (i1 == 0) {
        return Z.valueOf(al[0]);
      } else {
        return Z.valueOf(al[0]).multiply(al[1]);
      }
    } else {
      return recProduct(al, 0, i1);
    }
  }

  private static Z repeatedSquare(int len, final int k, final int[] primeList, final int[] multiList) {
    if (len == 0) {
      return Z.ONE;
    }
    int i = 0, mult = multiList[0];
    while (mult > 1) {
      if ((mult & 1) == 1) {
        primeList[len++] = primeList[i];
      }
      multiList[i++] = mult / 2;
      mult = multiList[i];
    }
    return product(primeList, i, len - i).pow(k).multiply(repeatedSquare(i, k << 1, primeList, multiList));
  }

  @Override
  public Z factorial(final int n) {
    if (n < SMALL_LIMIT) {
      if (n < 0) {
        throw new IllegalArgumentException("n must be nonnegative");
      }
      return SMALL[n];
    }
    final int[] primeList = new int[2 + (15 * n) / (8 * (IntegerUtils.lg(n) - 1))];
    final int[] multiList = new int[primeList.length];
    final int bound = n / 2;
    int count = 0;
    for (int prime = 3; prime <= n; prime = (int) PRIME.nextPrime(prime)) {
      primeList[count] = prime;
      if (prime > bound) {
        multiList[count] = 1;
      } else {
        int m = 0;
        int q = n;
        while (q >= prime) {
          q /= prime;
          m += q;
        }
        multiList[count] = m;
      }
      ++count;
    }
    return repeatedSquare(count, 1, primeList, multiList).shiftLeft(n - Integer.bitCount(n));
  }

  @Override
  public Z doubleFactorial(final int n) {
    throw new UnsupportedOperationException();
  }
}
