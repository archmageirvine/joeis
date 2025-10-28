package irvine.oeis.a390;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A390002 allocated for Vincenzo Manto.
 * @author Sean A. Irvine
 */
public class A390002 extends Sequence0 {

  private static final CR LOG15 = CR.valueOf(15).log10();
  private long mN = -1;

  @Override
  public Z next() {
    return ++mN == 0 ? Z.ONE : CR.TEN.pow(LOG15.multiply(mN).frac()).floor();
  }
}

