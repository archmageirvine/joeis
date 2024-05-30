package irvine.oeis.a066;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066750 Greatest common divisor of n and its digit sum.
 * @author Sean A. Irvine
 */
public class A066750 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Functions.GCD.z(++mN, Functions.DIGIT_SUM.l(mN));
  }
}

