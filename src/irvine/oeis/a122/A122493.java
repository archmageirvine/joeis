package irvine.oeis.a122;
// Generated by gen_seq4.pl unionm/union2 at 2023-08-15 07:12

import irvine.oeis.UnionSequence;
import irvine.oeis.a000.A000045;
import irvine.oeis.a000.A000217;

/**
 * A122493 Union of Fibonacci and triangular numbers.
 * @author Georg Fischer
 */
public class A122493 extends UnionSequence {

  /** Construct the sequence. */
  public A122493() {
    super(0, new A000045(), new A000217());
  }
}
