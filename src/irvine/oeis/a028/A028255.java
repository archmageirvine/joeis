package irvine.oeis.a028;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000040;
import irvine.oeis.a000.A000045;

/**
 * A028255 Fibonacci(n+3) mod n-th prime.
 * @author Sean A. Irvine
 */
public class A028255 extends A000040 {

  private final Sequence mF = new A000045().skip(4);

  @Override
  public Z next() {
    return mF.next().mod(super.next());
  }
}
