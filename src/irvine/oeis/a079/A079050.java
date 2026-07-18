package irvine.oeis.a079;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A079050 Sum of the digits of LookAndSay(n).
 * @author Sean A. Irvine
 */
public class A079050 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return Functions.DIGIT_SUM.z(Functions.LOOK_AND_SAY.z(++mN));
  }
}

