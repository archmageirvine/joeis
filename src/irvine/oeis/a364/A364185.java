package irvine.oeis.a364;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A364185 Leading digit of 11^n.
 * @author Sean A. Irvine
 */
public class A364185 extends Sequence0 {

  private static final CR LOG = CR.valueOf(11).log10();
  private long mN = -1;

  @Override
  public Z next() {
    return ++mN == 0 ? Z.ONE : CR.TEN.pow(LOG.multiply(mN).frac()).floor();
  }
}

