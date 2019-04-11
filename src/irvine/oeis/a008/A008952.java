package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008952 Leading digit of <code>2^n</code>.
 * @author Sean A. Irvine
 */
public class A008952 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.multiply2();
    return Z.valueOf(mA.toString().charAt(0) - '0');
  }
}
