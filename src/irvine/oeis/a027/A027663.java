package irvine.oeis.a027;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A027663 a(n)/100000 gives sqrt(n) to 5 places after the decimal point.
 * @author Sean A. Irvine
 */
public class A027663 extends Sequence1 {

  private static final CR CR100000 = CR.valueOf(100000);
  private long mN = 0;

  @Override
  public Z next() {
    return CR.valueOf(++mN).sqrt().multiply(CR100000).round();
  }
}
