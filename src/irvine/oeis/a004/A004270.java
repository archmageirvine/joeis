package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A004270 a(n) = ceiling(10000*log_2(n)).
 * @author Sean A. Irvine
 */
public class A004270 extends Sequence1 {

  private static final CR C = CR.valueOf(10000).divide(CR.TWO.log());
  private long mN = 0;

  @Override
  public Z next() {
    return CR.valueOf(++mN).log().multiply(C).ceil();
  }
}
