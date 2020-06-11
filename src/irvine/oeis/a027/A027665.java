package irvine.oeis.a027;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A027665 <code>a(n)/100000</code> gives <code>log_10(n)</code> to 5 places.
 * @author Sean A. Irvine
 */
public class A027665 implements Sequence {

  private static final CR CR100000 = CR.valueOf(100000);
  private static final CR LOG10 = CR.TEN.log();
  private long mN = 0;

  @Override
  public Z next() {
    return CR.valueOf(++mN).log().divide(LOG10).multiply(CR100000).round();
  }
}
