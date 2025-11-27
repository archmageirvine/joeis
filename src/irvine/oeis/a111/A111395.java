package irvine.oeis.a111;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A111395 First digit of powers of 5.
 * @author Sean A. Irvine
 */
public class A111395 extends Sequence0 {

  private static final CR LOG = CR.FIVE.log10();
  private long mN = -1;

  @Override
  public Z next() {
    return ++mN == 0 ? Z.ONE : CR.TEN.pow(LOG.multiply(mN).frac()).floor();
  }
}

