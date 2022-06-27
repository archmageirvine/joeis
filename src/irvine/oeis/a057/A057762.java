package irvine.oeis.a057;

import irvine.math.group.IntegersModMul;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A057762 Numbers n such that 5 is a square mod n.
 * @author Sean A. Irvine
 */
public class A057762 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final IntegersModMul m = new IntegersModMul(mN);
      final Z r = m.coerce(Z.FIVE);
      for (Z k = Z.ZERO; k.compareTo(mN) < 0; k = k.add(1)) {
        if (m.add(k, k).equals(r)) {
          return mN;
        }
      }
    }
  }
}

