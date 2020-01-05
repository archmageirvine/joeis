package irvine.oeis.a028;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a000.A000040;
import irvine.oeis.a000.A000045;

/**
 * A028256 <code>Fibonacci(n+2) mod n-th</code> prime.
 * @author Sean A. Irvine
 */
public class A028256 extends A000040 {

  private final Sequence mF = new SkipSequence(new A000045(), 3);

  @Override
  public Z next() {
    return mF.next().mod(super.next());
  }
}
