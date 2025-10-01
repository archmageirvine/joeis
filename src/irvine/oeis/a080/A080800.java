package irvine.oeis.a080;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A080800 Similar to A080799 but count only division steps.
 * @author Sean A. Irvine
 */
public class A080800 extends Sequence1 {

  private long mN = 1;

  @Override
  public Z next() {
    return Functions.DIGIT_LENGTH.z(2, ++mN).add(2);
  }
}
