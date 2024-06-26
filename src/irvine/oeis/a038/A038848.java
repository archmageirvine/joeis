package irvine.oeis.a038;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A038848 Even numbers that are differences between two cubes in at least one way.
 * @author Sean A. Irvine
 */
public class A038848 extends Sequence1 {

  private Z mN = Z.valueOf(24);

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(2);
      final Z lim = mN.sqrt();
      for (Z x = Z.ONE; x.compareTo(lim) <= 0; x = x.add(1)) {
        if (Predicates.CUBE.is(mN.add(x.pow(3)))) {
          return mN;
        }
      }
    }
  }
}
