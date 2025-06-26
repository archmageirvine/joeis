package irvine.oeis.a078;

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A078268 Smallest integer which is an integer multiple of the number N obtained by placing the string "n" after a decimal point.
 * @author Sean A. Irvine
 */
public class A078268 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return new Q(++mN, Z.TEN.pow(Functions.DIGIT_LENGTH.l(mN))).num();
  }
}

