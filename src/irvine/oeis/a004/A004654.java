package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004654 Powers of 2 written in base <code>15.</code> (Next term contains a non-decimal character.).
 * @author Sean A. Irvine
 */
public class A004654 implements Sequence {

  private Z mN = null;

  @Override
  public Z next() {
    mN = mN == null ? Z.ONE : mN.multiply2();
    return new Z(mN.toString(15));
  }
}

