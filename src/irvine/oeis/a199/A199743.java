package irvine.oeis.a199;

import irvine.oeis.FiniteSequence;

/**
 * A199743 Numbers which are very close to <code>(exp(Pi*sqrt(h))-744)^(1/3)</code> where h is <code>A003173(n+3)</code> (Heegner numbers of the form <code>4p-1</code> where p is prime).
 * @author Georg Fischer
 */
public class A199743 extends FiniteSequence {

  /** Construct the sequence. */
  public A199743() {
    super(15, 32, 96, 960, 5280, 640320);
  }
}
