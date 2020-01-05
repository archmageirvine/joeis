package irvine.oeis.a028;

import irvine.math.z.Z;
import irvine.oeis.a000.A000668;

/**
 * A028335 Number of decimal digits in n-th Mersenne prime.
 * @author Sean A. Irvine
 */
public class A028335 extends A000668 {
  
  @Override
  public Z next() {
    return Z.valueOf(super.next().toString().length());
  }
}
