package irvine.oeis.a080;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.a000.A000040;
import irvine.oeis.a078.A078908;

/**
 * A080088 Let r+i*s be the sum of the first-quadrant Gaussian primes dividing prime(n); sequence gives r values.
 * @author Sean A. Irvine
 */
public class A080088 extends A000040 {

  private final DirectSequence mA = new A078908();

  @Override
  public Z next() {
    return mA.a(super.next());
  }
}

