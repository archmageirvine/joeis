package irvine.oeis.a390;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A390696 allocated for Ruud H.G. van Tol.
 * @author Sean A. Irvine
 */
public class A390696 extends Sequence0 {

  private static final CR LOG = CR.valueOf(Z.ONE.shiftLeft(64)).log10();
  private long mN = -1;

  @Override
  public Z next() {
    return LOG.multiply(++mN).floor();
  }
}

