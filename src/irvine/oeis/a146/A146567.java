package irvine.oeis.a146;

import irvine.oeis.FiniteSequence;

/**
 * A146567 Numbers n such that <code>n*sigma_0(n)/(n+sigma_0(n)) =</code> c, c an integer.
 * @author Georg Fischer
 */
public class A146567 extends FiniteSequence {

  /** Construct the sequence. */
  public A146567() {
    super(2, 12, 24, 56, 60, 132, 1260);
  }
}
