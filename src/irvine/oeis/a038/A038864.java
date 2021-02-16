package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A038864 Numbers n such that n ends with '9' and is difference between two cubes in at least one way.
 * @author Sean A. Irvine
 */
public class A038864 implements Sequence {

  private Z mN = Z.NINE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(10);
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
