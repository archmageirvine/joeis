package irvine.oeis.a390;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A390605 allocated for Felix Huber.
 * @author Sean A. Irvine
 */
public class A390605 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final Z nn = Z.valueOf(++mN).pow(mN);
    long cnt = 1;
    for (final Z d : Jaguar.factor(mN).pow(mN).divisorsSorted()) {
      if (d.square().compareTo(nn) > 0) {
        break;
      }
      if (Predicates.POWER.is(d) && Predicates.POWER.is(nn.divide(d))) {
        if (mN == 22) {
          System.out.println(d + "*" + nn.divide(d) + " = " + FactorSequence.toString(Jaguar.factor(d)) + " * " + FactorSequence.toString(Jaguar.factor(nn.divide(d))));
        }
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
