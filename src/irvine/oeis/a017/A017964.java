package irvine.oeis.a017;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A017964 Powers of <code>sqrt(20)</code> rounded down.
 * @author Sean A. Irvine
 */
public class A017964 implements Sequence {

  private Z mN = null;

  @Override
  public Z next() {
    mN = mN == null ? Z.ONE : mN.multiply(20);
    return mN.sqrt();
  }
}

