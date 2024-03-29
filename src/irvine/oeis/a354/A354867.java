package irvine.oeis.a354;
// Generated by gen_seq4.pl 2024-02-28/tuptraf at 2024-02-28 22:56

import irvine.oeis.a122.A122111;
import irvine.oeis.transform.TupleTransformSequence;

/**
 * A354867 Sum of A122111 and its Dirichlet inverse.
 * @author Georg Fischer
 */
public class A354867 extends TupleTransformSequence {

  /** Construct the sequence. */
  public A354867() {
    super(1, (n, s) -> s[0].add(s[1]), "", new A122111(), new A354866());
  }
}
