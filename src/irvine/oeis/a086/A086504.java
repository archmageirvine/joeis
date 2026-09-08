package irvine.oeis.a086;

import irvine.math.z.Fibonacci;
import irvine.oeis.FilterSequence;
import irvine.oeis.a018.A018252;

/**
 * A086504 Nonprimes k that divide (Fibonacci(k^2)-1).
 * @author Sean A. Irvine
 */
public class A086504 extends FilterSequence {

  /** Construct the sequence. */
  public A086504() {
    super(1, new A018252(), k -> k.isOne() || Fibonacci.fibonacci(k.square(), k).isOne());
  }
}

