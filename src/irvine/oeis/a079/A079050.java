package irvine.oeis.a079;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A079050 Sum of the digits of LookAndSay(n).
 * @author Sean A. Irvine
 */
public class A079050 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Functions.DIGIT_SUM.z(Functions.LOOK_AND_SAY.z(++mN));
  }
}

