package irvine.oeis.a365;
// Generated by gen_seq4.pl 2024-04-11/tuptraf at 2024-04-11 21:12

import irvine.oeis.a263.A263273;
import irvine.oeis.transform.TupleTransformSequence;

/**
 * A365804 Sum of bijective base-3 reverse of n (A263273) and its Dirichlet inverse.
 * @author Georg Fischer
 */
public class A365804 extends TupleTransformSequence {

  /** Construct the sequence. */
  public A365804() {
    super(1, (n, s) -> s[0].add(s[1]), "", new A263273().skip(1), new A365803());
  }
}
