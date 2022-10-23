package irvine.oeis.a027;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A027662 a(n)/1000 gives sqrt(n) to 3 places after the decimal point.
 * @author Sean A. Irvine
 */
public class A027662 extends Sequence1 {

  private static final CR CR1000 = CR.valueOf(1000);
  private long mN = 0;

  @Override
  public Z next() {
    return CR.valueOf(++mN).sqrt().multiply(CR1000).round();
  }
}
