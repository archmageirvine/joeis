package irvine.oeis.a007;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007542 Successive integers produced by Conway's PRIMEGAME.
 * @author Sean A. Irvine
 */
public class A007542 implements Sequence {

  private static final Q[] CONWAY_PRIMEGAME = {
    new Q(17, 91),
    new Q(78, 85),
    new Q(19, 51),
    new Q(23, 38),
    new Q(29, 33),
    new Q(77, 29),
    new Q(95, 23),
    new Q(77, 19),
    new Q(1, 17),
    new Q(11, 13),
    new Q(13, 11),
    new Q(15, 2),
    new Q(1, 7),
    new Q(55)
  };

  private long mN = 0;
  private Z mP = Z.TWO;

  static Z conwayPrimeGame(final Z p) {
    for (final Q c : CONWAY_PRIMEGAME) {
      final Q t = c.multiply(p);
      if (t.isInteger()) {
        return t.toZ();
      }
    }
    throw new RuntimeException();
  }

  @Override
  public Z next() {
    if (++mN > 1) {
      mP = conwayPrimeGame(mP);
    }
    return mP;
  }

}
