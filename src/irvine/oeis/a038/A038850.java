package irvine.oeis.a038;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A038850 Multiples of 8 that are the difference of two positive cubes.
 * @author Sean A. Irvine
 */
public class A038850 extends Sequence1 {

  private Z mN = Z.valueOf(48);

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(8);
      final Z lim = mN.sqrt();
      for (Z x = Z.ONE; x.compareTo(lim) <= 0; x = x.add(1)) {
        if (Predicates.CUBE.is(mN.add(x.pow(3)))) {
          return mN;
        }
      }
    }
  }
}
