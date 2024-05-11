package irvine.oeis.a038;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A038849 Multiples of 4 that are the difference of two positive cubes.
 * @author Sean A. Irvine
 */
public class A038849 extends Sequence1 {

  private Z mN = Z.valueOf(52);

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(4);
      final Z lim = mN.sqrt();
      for (Z x = Z.ONE; x.compareTo(lim) <= 0; x = x.add(1)) {
        if (Predicates.CUBE.is(mN.add(x.pow(3)))) {
          return mN;
        }
      }
    }
  }
}
