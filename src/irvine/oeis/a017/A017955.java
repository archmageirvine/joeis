package irvine.oeis.a017;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A017955 Powers of <code>sqrt(17)</code> rounded down.
 * @author Sean A. Irvine
 */
public class A017955 implements Sequence {

  private Z mN = null;

  @Override
  public Z next() {
    mN = mN == null ? Z.ONE : mN.multiply(17);
    return mN.sqrt();
  }
}

