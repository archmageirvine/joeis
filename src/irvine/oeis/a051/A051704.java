package irvine.oeis.a051;

import irvine.factor.prime.Fast;
import irvine.math.IntegerUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.math.partitions.IntegerPartition;

/**
 * A051704 Maximal value of products of partitions of n into powers of distinct primes (powers of 1 and <code>2</code> excluded).
 * @author Sean A. Irvine
 */
public class A051704 implements Sequence {

  private static final Z[] SMALL_CASES = {Z.ONE, Z.ZERO, Z.ZERO, Z.THREE, Z.ZERO, Z.FIVE, Z.ZERO};
  private final Fast mPrime = new Fast();
  private int mN = -1;

  private boolean isPrimePower(final long n) {
    if ((n & 1) == 0) {
      return false;
    }
    if (mPrime.isPrime(n)) {
      return true;
    }
    final Z p = Z.valueOf(n).isPower();
    return p != null;
  }

  @Override
  public Z next() {
    if (++mN < SMALL_CASES.length) {
      return SMALL_CASES[mN];
    }
    final IntegerPartition ip = new IntegerPartition(mN);
    int[] p;
    Z maxProduct = Z.ZERO;
    while ((p = ip.next()) != null) {
      if (p[p.length - 1] > 2) {
        boolean ok = true;
        for (int k = 1; ok && k < p.length; ++k) {
          for (int j = 0; j < k; ++j) {
            if (IntegerUtils.gcd(p[k], p[j]) != 1) {
              ok = false;
              break;
            }
          }
        }
        if (ok) {
          for (int k = 0; ok && k < p.length; ++k) {
            ok = isPrimePower(p[k]) && (k == 0 || p[k] != p[k - 1]);
          }
        }
        if (ok) {
          //System.out.println(java.util.Arrays.toString(p));
          Z prod = Z.ONE;
          for (int v : p) {
            prod = prod.multiply(v);
          }
          if (prod.compareTo(maxProduct) > 0) {
            maxProduct = prod;
          }
        }
      }
    }
    return maxProduct;
  }
}
