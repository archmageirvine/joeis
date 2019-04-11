package irvine.oeis.a017;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A017943 Powers of <code>sqrt(13)</code> rounded down.
 * @author Sean A. Irvine
 */
public class A017943 implements Sequence {

  private Z mN = null;

  @Override
  public Z next() {
    mN = mN == null ? Z.ONE : mN.multiply(13);
    return mN.sqrt();
  }
}

