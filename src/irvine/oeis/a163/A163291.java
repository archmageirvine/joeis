package irvine.oeis.a163;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A163291 Number of digits of n-th prime written in base 4.
 * @author Georg Fischer
 */
public class A163291 extends A000040 {

  @Override
  public Z next() {
    return Z.valueOf(super.next().toString(4).length());
  }
}
