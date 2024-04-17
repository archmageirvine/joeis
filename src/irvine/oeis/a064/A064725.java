package irvine.oeis.a064;

import irvine.math.function.Functions;
import irvine.oeis.a000.A000045;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A064725 Sum of primes dividing Fibonacci(n) (with repetition).
 * @author Sean A. Irvine
 */
public class A064725 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A064725() {
    super(1, new A000045().skip(), k -> Functions.SOPFR.z(k));
  }
}
