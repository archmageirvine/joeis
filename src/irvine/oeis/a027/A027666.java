package irvine.oeis.a027;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A027666 a(n)/10000000 gives log_10(n) to 7 places.
 * @author Sean A. Irvine
 */
public class A027666 implements Sequence {

  private static final CR CR10000000 = CR.valueOf(10000000);
  private static final CR LOG10 = CR.TEN.log();
  private long mN = 0;

  @Override
  public Z next() {
    return CR.valueOf(++mN).log().divide(LOG10).multiply(CR10000000).round();
  }
}
