package irvine.oeis.a080;

import irvine.math.function.Functions;
import irvine.oeis.a000.A000045;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A080648 Sum of prime factors of Fibonacci(n).
 * @author Sean A. Irvine
 */
public class A080648 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A080648() {
    super(1, new A000045().skip(), Functions.SOPF::z);
  }
}
