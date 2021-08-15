package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A038849 Multiples of 4 that are the difference of two positive cubes.
 * @author Sean A. Irvine
 */
public class A038849 implements Sequence {

  private Z mN = Z.valueOf(52);

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(4);
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
