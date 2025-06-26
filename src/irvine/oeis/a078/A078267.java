package irvine.oeis.a078;

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A078267 Smallest k such that k*N is an integer where N is obtained by placing the string "n" after a decimal point.
 * @author Sean A. Irvine
 */
public class A078267 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return new Q(++mN, Z.TEN.pow(Functions.DIGIT_LENGTH.l(mN))).den();
  }
}

