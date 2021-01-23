package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004269 a(n) = round(10000*log_2(n)).
 * @author Sean A. Irvine
 */
public class A004269 implements Sequence {

  private static final CR C = CR.valueOf(10000).divide(CR.TWO.log());
  private long mN = 0;

  @Override
  public Z next() {
    return CR.valueOf(++mN).log().multiply(C).round();
  }
}
