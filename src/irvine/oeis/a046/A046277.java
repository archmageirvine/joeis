package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.a000.A000142;

/**
 * A046277 Largest prime substring in n! (0 if none).
 * @author Sean A. Irvine
 */
public class A046277 extends A000142 {

  @Override
  public Z next() {
    return new Z(A046268.largestPrimeSubstring(super.next().toString()));
  }
}
