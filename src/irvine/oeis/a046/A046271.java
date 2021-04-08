package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A046271 Largest prime substring in 5^n (0 if none).
 * @author Sean A. Irvine
 */
public class A046271 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.multiply(5);
    return new Z(A046268.largestPrimeSubstring(mA.toString()));
  }
}
