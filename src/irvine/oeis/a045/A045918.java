package irvine.oeis.a045;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A045918 Describe n. Also called the "Say What You See" or "Look and Say" sequence LS(n).
 * @author Sean A. Irvine
 */
public class A045918 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return Functions.LOOK_AND_SAY.z(++mN);
  }
}
