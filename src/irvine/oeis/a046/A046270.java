package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A046270 Largest prime substring in 4^n (0 if none).
 * @author Sean A. Irvine
 */
public class A046270 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.multiply(4);
    return new Z(A046268.largestPrimeSubstring(mA.toString()));
  }
}
