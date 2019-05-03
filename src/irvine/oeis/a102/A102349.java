package irvine.oeis.a102;

import irvine.oeis.FiniteSequence;

/**
 * A102349 Numbers n such that <code>binomial(n+1,2)</code> is in <code>A027568</code>.
 * @author Georg Fischer
 */
public class A102349 extends FiniteSequence {

  /** Construct the sequence. */
  public A102349() {
    super(0, 1, 4, 15, 55, 119);
  }
}
