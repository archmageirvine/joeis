package irvine.oeis.a362;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A362871 Leading digit of 6^n.
 * @author Sean A. Irvine
 */
public class A362871 extends Sequence0 {

  private static final CR LOG = CR.valueOf(6).log10();
  private long mN = -1;

  @Override
  public Z next() {
    return ++mN == 0 ? Z.ONE : CR.TEN.pow(LOG.multiply(mN).frac()).floor();
  }
}

