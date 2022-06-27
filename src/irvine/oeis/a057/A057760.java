package irvine.oeis.a057;

import irvine.math.group.IntegersModMul;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A057760 Numbers n such that 2 is a cube mod n.
 * @author Sean A. Irvine
 */
public class A057760 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final IntegersModMul m = new IntegersModMul(mN);
      final Z r = m.coerce(Z.TWO);
      for (Z k = Z.ZERO; k.compareTo(mN) < 0; k = k.add(1)) {
        if (m.groupMultiply(k, 3).equals(r)) {
          return mN;
        }
      }
    }
  }
}

