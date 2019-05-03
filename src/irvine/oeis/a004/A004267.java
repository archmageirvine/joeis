package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004267 <code>1000*log_2 (n)</code> rounded up to the nearest integer.
 * @author Sean A. Irvine
 */
public class A004267 implements Sequence {

  private static final CR C = CR.valueOf(1000).divide(CR.TWO.log());
  private long mN = 0;

  @Override
  public Z next() {
    return CR.valueOf(++mN).log().multiply(C).ceil(32);
  }
}
