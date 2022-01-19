package irvine.oeis.a132;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A132227 a(n) = 3*prime(n) - 5.
 * @author Sean A. Irvine
 */
public class A132227 extends A000040 {

  @Override
  public Z next() {
    return super.next().multiply(3).subtract(5);
  }
}
