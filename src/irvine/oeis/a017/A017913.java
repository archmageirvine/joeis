package irvine.oeis.a017;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A017913 Powers of <code>sqrt(3)</code> rounded down.
 * @author Sean A. Irvine
 */
public class A017913 implements Sequence {

  private Z mN = null;

  @Override
  public Z next() {
    mN = mN == null ? Z.ONE : mN.multiply(3);
    return mN.sqrt();
  }
}

