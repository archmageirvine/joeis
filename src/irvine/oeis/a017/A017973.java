package irvine.oeis.a017;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A017973 Powers of sqrt(23) rounded down.
 * @author Sean A. Irvine
 */
public class A017973 implements Sequence {

  private Z mN = null;

  @Override
  public Z next() {
    mN = mN == null ? Z.ONE : mN.multiply(23);
    return mN.sqrt();
  }
}

