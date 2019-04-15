package irvine.oeis.a000;

import irvine.math.z.Z;

/**
 * A000071 <code>a(n) = Fibonacci(n) - 1</code>.
 * @author Sean A. Irvine
 */
public class A000071 extends A000045 {

  /** Construct the sequence. */
  public A000071() {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().subtract(Z.ONE);
  }
}

