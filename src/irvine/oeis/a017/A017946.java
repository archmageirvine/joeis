package irvine.oeis.a017;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A017946 Powers of <code>sqrt(14)</code> rounded down.
 * @author Sean A. Irvine
 */
public class A017946 implements Sequence {

  private Z mN = null;

  @Override
  public Z next() {
    mN = mN == null ? Z.ONE : mN.multiply(14);
    return mN.sqrt();
  }
}

