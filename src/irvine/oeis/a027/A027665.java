package irvine.oeis.a027;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A027665 a(n)/100000 gives log_10(n) to 5 places.
 * @author Sean A. Irvine
 */
public class A027665 extends Sequence1 {

  private static final CR CR100000 = CR.valueOf(100000);
  private long mN = 0;

  @Override
  public Z next() {
    return CR.valueOf(++mN).log10().multiply(CR100000).round();
  }
}
