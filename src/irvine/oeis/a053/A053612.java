package irvine.oeis.a053;

import irvine.oeis.FiniteSequence;

/**
 * A053612 Numbers such that <code>1+2+3</code>...+a(n) <code>= 1+4+9+</code>...+r^2, for some r.
 * @author Georg Fischer
 */
public class A053612 extends FiniteSequence {

  /** Construct the sequence. */
  public A053612() {
    super(1, 10, 13, 645);
  }
}
