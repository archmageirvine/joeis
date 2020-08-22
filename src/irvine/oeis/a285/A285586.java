package irvine.oeis.a285;

import irvine.oeis.FiniteSequence;

/**
 * A285586 Complete list of numbers n for which there exists no prime number between n and 9n/8 inclusive.
 * @author Georg Fischer
 */
public class A285586 extends FiniteSequence {

  /** Construct the sequence. */
  public A285586() {
    super(1, 4, 6, 8, 9, 14, 15, 20, 24, 25, 32);
  }
}
