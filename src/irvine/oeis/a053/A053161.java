package irvine.oeis.a053;

import irvine.math.IntegerUtils;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a019.A019518;
import irvine.util.Permutation;

/**
 * A053161 Largest prime associated with A053095(n), or zero if no such prime exists.
 * @author Sean A. Irvine
 */
public class A053161 extends A019518 {

  // Some contortions here using 9-digit transform to make permutation work in forward order

  static Permutation reversePermuter(final Z n) {
    final int[] cnts = ZUtils.digitCounts(n);
    final int sum = (int) IntegerUtils.sum(cnts);
    final int[] digits = new int[sum];
    for (int k = 0, i = 0; k < cnts.length; ++k) {
      for (int j = 0; j < cnts[k]; ++j) {
        digits[i++] = 9 - k;
      }
    }
    return new Permutation(digits);
  }

  private static Z reversePermToZ(final int[] p) {
    Z t = Z.ZERO;
    for (int v : p) {
      t = t.multiply(10).add(9 - v);
    }
    return t;
  }

  @Override
  public Z next() {
    final Z m = super.next();
    if (Functions.DIGIT_SUM.l(m) % 3 == 0) {
      return Z.ZERO;
    }
    final Permutation perm = reversePermuter(m);
    int[] p;
    while ((p = perm.next()) != null) {
      if (p[0] != 9) {
        final Z t = reversePermToZ(p);
        if (t.isProbablePrime()) {
          return t;
        }
      }
    }
    return Z.ZERO;
  }
}
