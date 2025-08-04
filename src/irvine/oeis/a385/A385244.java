package irvine.oeis.a385;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A385244 allocated for Robert Price.
 * @author Sean A. Irvine
 */
public class A385244 extends Sequence1 {

  private Z mA = Z.valueOf(33);
  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      mA = mA.multiply(1089);
      if (Predicates.PRIME.is(mN) && mA.add(Z.ONE.shiftLeft(mN)).divide(35).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
