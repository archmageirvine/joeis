package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A046274 Largest prime substring in 8^n (0 if none).
 * @author Sean A. Irvine
 */
public class A046274 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.multiply(8);
    return new Z(A046268.largestPrimeSubstring(mA.toString()));
  }
}
