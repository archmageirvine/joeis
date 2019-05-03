package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004667 Powers of 3 written in base <code>13. (Next</code> term contains a <code>non-decimal digit.)</code>.
 * @author Sean A. Irvine
 */
public class A004667 implements Sequence {

  private Z mN = null;

  @Override
  public Z next() {
    mN = mN == null ? Z.ONE : mN.multiply(3);
    return new Z(mN.toString(13));
  }
}

