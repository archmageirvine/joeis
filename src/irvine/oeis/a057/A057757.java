package irvine.oeis.a057;

import irvine.math.group.IntegersModMul;
import irvine.math.z.Z;

/**
 * A057757 Least nonnegative square root of 2 mod n for n in A057126.
 * @author Sean A. Irvine
 */
public class A057757 extends A057126 {

  @Override
  public Z next() {
    final Z n = super.next();
    final IntegersModMul m = new IntegersModMul(n);
    final Z r = m.coerce(Z.TWO);
    for (Z k = Z.ZERO; true; k = k.add(1)) {
      if (m.add(k, k).equals(r)) {
        return k;
      }
    }
  }
}

