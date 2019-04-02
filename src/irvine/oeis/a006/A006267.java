package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006267 Continued cotangent for the golden ratio.
 * @author Sean A. Irvine
 */
public class A006267 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.pow(3).add(mA.multiply(3));
    return mA;
  }
}
