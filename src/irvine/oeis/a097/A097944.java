package irvine.oeis.a097;
// manually 2021-06-22

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A097944 Number of digits in n-th prime.
 * @author Georg Fischer
 */
public class A097944 extends A000040 {
  
  @Override
  public Z next() {
    return Z.valueOf(super.next().toString().length());
  }
}
