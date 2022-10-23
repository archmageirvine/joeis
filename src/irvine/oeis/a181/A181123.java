package irvine.oeis.a181;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A181123 Numbers that are the differences of two positive cubes.
 * @author Sean A. Irvine
 */
public class A181123 extends Sequence1 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (mN.isZero()) {
        return Z.ZERO; // x == y
      }
      final Z lim = mN.sqrt();
      for (Z x = Z.ONE; x.compareTo(lim) <= 0; x = x.add(1)) {
        final Z s = mN.add(x.pow(3));
        s.root(3);
        if (s.auxiliary() == 1) {
          return mN;
        }
      }
    }
  }
}
