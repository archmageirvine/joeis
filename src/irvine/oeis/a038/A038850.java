package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A038850 Multiples of 8 that are the difference of two positive cubes.
 * @author Sean A. Irvine
 */
public class A038850 implements Sequence {

  private Z mN = Z.valueOf(48);

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(8);
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
