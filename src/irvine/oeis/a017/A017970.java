package irvine.oeis.a017;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A017970 Powers of sqrt(22) rounded down.
 * @author Sean A. Irvine
 */
public class A017970 implements Sequence {

  private Z mN = null;

  @Override
  public Z next() {
    mN = mN == null ? Z.ONE : mN.multiply(22);
    return mN.sqrt();
  }
}

