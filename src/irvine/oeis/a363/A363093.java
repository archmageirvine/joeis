package irvine.oeis.a363;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A363093 Leading digit of 7^n.
 * @author Sean A. Irvine
 */
public class A363093 extends Sequence0 {

  private static final CR LOG = CR.valueOf(7).log10();
  private long mN = -1;

  @Override
  public Z next() {
    return ++mN == 0 ? Z.ONE : CR.TEN.pow(LOG.multiply(mN).frac()).floor();
  }
}

