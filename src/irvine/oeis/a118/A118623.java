package irvine.oeis.a118;
// Generated by gen_seq4.pl 2024-04-01/tuptraf at 2024-04-01 22:42

import irvine.math.function.Functions;
import irvine.oeis.transform.TupleTransformSequence;

/**
 * A118623 a(0) = 1, a(n+1) = a(n)^2 + number of divisors of a(n).
 * @author Georg Fischer
 */
public class A118623 extends TupleTransformSequence {

  /** Construct the sequence. */
  public A118623() {
    super(0, (n, s) -> s[0].square().add(Functions.SIGMA0.z(s[0])), "1", PREVIOUS);
  }
}
