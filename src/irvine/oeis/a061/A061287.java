package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.oeis.a000.A000045;

/**
 * A061287 Integer part of square root of n-th Fibonacci number.
 * @author Sean A. Irvine
 */
public class A061287 extends A000045 {

  @Override
  public Z next() {
    return super.next().sqrt();
  }
}
