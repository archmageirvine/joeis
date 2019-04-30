package irvine.oeis.a100;

import irvine.oeis.FiniteSequence;

/**
 * A100893 <code>a(n) =</code> smallest n-digit prime formed by appending a digit to <code>a(n-1); a(1) = 2</code>.
 * @author Georg Fischer
 */
public class A100893 extends FiniteSequence {

  /** Construct the sequence. */
  public A100893() {
    super(2, 23, 233, 2333, 23333);
  }
}
