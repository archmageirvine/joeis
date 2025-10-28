package irvine.oeis.a060;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A060956 Leading digit of 3^n.
 * @author Sean A. Irvine
 */
public class A060956 extends Sequence0 {

  private static final CR LOG = CR.valueOf(3).log10();
  private long mN = -1;

  @Override
  public Z next() {
    return ++mN == 0 ? Z.ONE : CR.TEN.pow(LOG.multiply(mN).frac()).floor();
  }
}

