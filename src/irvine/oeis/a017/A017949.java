package irvine.oeis.a017;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A017949 Powers of <code>sqrt(15)</code> rounded down.
 * @author Sean A. Irvine
 */
public class A017949 implements Sequence {

  private Z mN = null;

  @Override
  public Z next() {
    mN = mN == null ? Z.ONE : mN.multiply(15);
    return mN.sqrt();
  }
}

