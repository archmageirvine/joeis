package irvine.oeis.a017;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A017976 Powers of <code>sqrt(24)</code> rounded down.
 * @author Sean A. Irvine
 */
public class A017976 implements Sequence {

  private Z mN = null;

  @Override
  public Z next() {
    mN = mN == null ? Z.ONE : mN.multiply(24);
    return mN.sqrt();
  }
}

