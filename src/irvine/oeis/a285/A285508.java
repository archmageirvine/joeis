package irvine.oeis.a285;
// Generated by gen_seq4.pl union/union2 at 2023-08-16 22:08

import irvine.oeis.UnionSequence;
import irvine.oeis.a030.A030078;
import irvine.oeis.a054.A054753;

/**
 * A285508 Numbers with exactly three prime factors, not all distinct.
 * @author Georg Fischer
 */
public class A285508 extends UnionSequence {

  /** Construct the sequence. */
  public A285508() {
    super(1, new A030078(), new A054753());
  }
}
