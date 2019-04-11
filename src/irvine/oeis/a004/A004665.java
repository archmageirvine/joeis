package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004665 Powers of 3 written in base <code>11.</code> (Next term contains a non-decimal character.).
 * @author Sean A. Irvine
 */
public class A004665 implements Sequence {

  private Z mN = null;

  @Override
  public Z next() {
    mN = mN == null ? Z.ONE : mN.multiply(3);
    return new Z(mN.toString(11));
  }
}

