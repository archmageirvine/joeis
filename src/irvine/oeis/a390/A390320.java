package irvine.oeis.a390;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a373.A373387;

/**
 * A390320 Positive integers (not multiples of 10 and greater than 1) whose constant congruence speed is greater than the maximum of the constant congruence speeds of all their prime factors (see A373387 for the definition of "constant congruence speed").
 * @author Sean A. Irvine
 */
public class A390320 extends Sequence1 {

  private final DirectSequence mA = new A373387();
  private int mN = 1;

  private boolean is(final int n) {
    if (n % 10 == 0) {
      return false;
    }
    final Z cs = mA.a(n);
    final FactorSequence fs = Jaguar.factor(n);
    for (final Z p : fs.toZArray()) {
      if (mA.a(p).compareTo(cs) >= 0) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      if (is(++mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}

