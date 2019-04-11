package irvine.oeis.a017;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A017967 Powers of <code>sqrt(21)</code> rounded down.
 * @author Sean A. Irvine
 */
public class A017967 implements Sequence {

  private Z mN = null;

  @Override
  public Z next() {
    mN = mN == null ? Z.ONE : mN.multiply(21);
    return mN.sqrt();
  }
}

