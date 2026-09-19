package irvine.oeis.a086;

import irvine.oeis.a022.A022307;
import irvine.oeis.transform.MobiusTransformSequence;

/**
 * A086597 Number of primitive prime factors in Fibonacci(n).
 * @author Sean A. Irvine
 */
public class A086597 extends MobiusTransformSequence {

  /** Construct the sequence. */
  public A086597() {
    super(1, new A022307().skip(), 0);
    skip();
  }
}
