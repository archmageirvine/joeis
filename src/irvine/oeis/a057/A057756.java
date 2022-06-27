package irvine.oeis.a057;

import irvine.math.group.IntegersModMul;
import irvine.math.z.Z;
import irvine.oeis.a008.A008784;

/**
 * A057756 Least nonnegative square root of -1 mod n for n in A008784.
 * @author Sean A. Irvine
 */
public class A057756 extends A008784 {

  @Override
  public Z next() {
    final Z n = super.next();
    final Z n1 = n.subtract(1);
    final IntegersModMul m = new IntegersModMul(n);
    for (Z k = Z.ZERO; true; k = k.add(1)) {
      if (m.add(k, k).equals(n1)) {
        return k;
      }
    }
  }
}

