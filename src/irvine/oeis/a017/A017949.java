package irvine.oeis.a017;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A017949 Powers of sqrt(15) rounded down.
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

