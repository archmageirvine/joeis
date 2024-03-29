package irvine.oeis.a329;
// Generated by gen_seq4.pl union/union2 at 2023-08-16 22:08

import irvine.oeis.UnionSequence;
import irvine.oeis.a000.A000217;
import irvine.oeis.a005.A005123;

/**
 * A329269 Integers k such that 8*k + 1 is a prime or a square.
 * @author Georg Fischer
 */
public class A329269 extends UnionSequence {

  /** Construct the sequence. */
  public A329269() {
    super(1, new A000217(), new A005123());
  }
}
