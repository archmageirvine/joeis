package irvine.oeis.a390;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A390318 allocated for Dwight Boddorf.
 * @author Sean A. Irvine
 */
public class A390318 extends Sequence0 {

  private static final CR INV_GAMMA = CR.GAMMA.inverse();
  private long mN = -1;

  @Override
  public Z next() {
    return INV_GAMMA.pow(++mN).floor();
  }
}

