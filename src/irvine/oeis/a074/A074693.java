package irvine.oeis.a074;
// Generated by gen_seq4.pl 2023-11-13/tuptraf at 2023-11-17 15:02

import irvine.math.function.Functions;
import irvine.oeis.transform.TupleTransformSequence;

/**
 * A074693 a(1) = 1, a(n) = a(n-1) + phi(a(n-1)).
 * @author Georg Fischer
 */
public class A074693 extends TupleTransformSequence {

  /** Construct the sequence. */
  public A074693() {
    super(1, (n, s) -> s[0].add(Functions.PHI.z(s[0])), "1", PREVIOUS);
  }
}
