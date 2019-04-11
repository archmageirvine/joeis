package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004264 100*log_2 <code>(n)</code> rounded up.
 * @author Sean A. Irvine
 */
public class A004264 implements Sequence {

  private static final CR C = CR.valueOf(100).divide(CR.TWO.log());
  private long mN = 0;

  @Override
  public Z next() {
    return CR.valueOf(++mN).log().multiply(C).ceil(32);
  }
}
