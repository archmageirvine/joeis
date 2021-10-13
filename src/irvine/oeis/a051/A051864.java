package irvine.oeis.a051;

import irvine.math.group.IntegersModMul;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A051864 Sum of transposition distances (divided by 2) present in the permutation produced by inverses of 1..(p-1) computed in Zp, where p is n-th prime.
 * @author Sean A. Irvine
 */
public class A051864 extends A000040 {

  @Override
  public Z next() {
    final Z p = super.next();
    final IntegersModMul zp = new IntegersModMul(p);
    Z sum = Z.ZERO;
    for (Z t = Z.ONE; !t.equals(p); t = t.add(1)) {
      sum = sum.add(zp.negate(t).subtract(t).abs());
    }
    return sum.divide2();
  }
}
