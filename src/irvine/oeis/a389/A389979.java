package irvine.oeis.a389;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a387.A373387;

/**
 * A389979 Positive integers (not multiples of 10) whose constant congruence speed is greater than the sum of the constant congruence speeds of all their prime factors counted with multiplicity.
 * @author Sean A. Irvine
 */
public class A389979 extends Sequence1 {

  private final DirectSequence mA = new A373387();
  private long mN = 14;

  @Override
  public Z next() {
    while (true) {
      if (++mN % 10 != 0){
        final FactorSequence fs = Jaguar.factor(mN);
        Z sum = Z.ZERO;
        for (final Z p : fs.toZArray()) {
          sum = sum.add(mA.a(p).multiply(fs.getExponent(p)));
        }
        if (mA.a(Z.valueOf(mN)).compareTo(sum) > 0) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}

