package irvine.oeis.a322;

import irvine.oeis.FiniteSequence;

/**
 * A322271 Smallest multiplication factors f, prime or <code>1,</code> for all b <code>(mod 24),</code> coprime to <code>24,</code> so that b*f is a nonzero square <code>mod 8</code> and <code>mod 3</code>.
 * @author Georg Fischer
 */
public class A322271 extends FiniteSequence {

  /** Construct the sequence. */
  public A322271() {
    super(1, 5, 7, 11, 13, 17, 19, 23);
  }
}
