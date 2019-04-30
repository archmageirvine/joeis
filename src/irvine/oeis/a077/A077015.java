package irvine.oeis.a077;

import irvine.oeis.FiniteSequence;

/**
 * A077015 <code>a(1) = 1</code>, continue by multiplying by the smallest composite number and then dividing by the smallest prime not used earlier and taking the integer part at every step.
 * @author Georg Fischer
 */
public class A077015 extends FiniteSequence {

  /** Construct the sequence. */
  public A077015() {
    super(1, 4, 2, 12, 4, 32, 6, 54, 7, 70, 6, 72, 5, 70, 4, 60, 3, 48, 2, 36, 1, 20);
  }
}
