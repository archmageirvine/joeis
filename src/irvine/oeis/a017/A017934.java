package irvine.oeis.a017;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A017934 Powers of <code>sqrt(10)</code> rounded down.
 * @author Sean A. Irvine
 */
public class A017934 implements Sequence {

  private Z mN = null;

  @Override
  public Z next() {
    mN = mN == null ? Z.ONE : mN.multiply(10);
    return mN.sqrt();
  }
}

