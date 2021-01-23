package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;
import irvine.oeis.a000.A000045;

/**
 * A004399 Fibonacci(n+2) plus n-th prime.
 * @author Sean A. Irvine
 */
public class A004399 extends A000040 {

  private final A000045 mFib = new A000045();

  {
    mFib.next();
    mFib.next();
    mFib.next();
  }

  @Override
  public Z next() {
    return super.next().add(mFib.next());
  }
}
