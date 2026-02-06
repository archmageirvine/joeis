package irvine.oeis.a083;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A083546 The geometric mean of the Euler totient function of 2 consecutive integers {k, k+1} when it is an integer.
 * @author Sean A. Irvine
 */
public class A083546 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z t = Functions.PHI.z(++mN).multiply(Functions.PHI.z(mN + 1));
      final Z s = t.sqrt();
      if (t.auxiliary() == 1) {
        return s;
      }
    }
  }
}

