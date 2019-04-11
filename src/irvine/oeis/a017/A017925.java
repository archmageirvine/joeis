package irvine.oeis.a017;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A017925 Powers of <code>sqrt(7)</code> rounded down.
 * @author Sean A. Irvine
 */
public class A017925 implements Sequence {

  private Z mN = null;

  @Override
  public Z next() {
    mN = mN == null ? Z.ONE : mN.multiply(7);
    return mN.sqrt();
  }
}

