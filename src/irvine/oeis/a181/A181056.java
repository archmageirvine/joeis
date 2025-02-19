package irvine.oeis.a181;
// Generated by gen_seq4.pl knowna4/simtraf at 2023-09-26 15:09

import irvine.math.function.Functions;
import irvine.oeis.a065.A065449;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A181056 a(n) = prime(phi(Fibonacci(n))).
 * @author Georg Fischer
 */
public class A181056 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A181056() {
    super(1, new A065449(), v -> Functions.PRIME.z(v));
    super.next();
  }
}
