package irvine.oeis.a027;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A027662 a(n)/1000 gives sqrt(n) to 3 places.
 * @author Sean A. Irvine
 */
public class A027662 implements Sequence {

  private static final CR CR1000 = CR.valueOf(1000);
  private long mN = 0;

  @Override
  public Z next() {
    return CR.valueOf(++mN).sqrt().multiply(CR1000).round();
  }
}
