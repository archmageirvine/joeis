package irvine.oeis.a084;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence0;

/**
 * A084319 Orbit of 91 under function described in A084317.
 * @author Sean A. Irvine
 */
public class A084319 extends Sequence0 {

  private final DirectSequence mA = new A084317();
  private Z mT = null;

  @Override
  public Z next() {
    mT = mT == null ? Z.valueOf(91) : mA.a(mT);
    return mT;
  }
}
