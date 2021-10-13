package irvine.oeis.a199;

import irvine.oeis.FiniteSequence;

/**
 * A199743 Rounded near-integers (exp(Pi*sqrt(h)) - 744)^(1/3) where h is A003173(n+3) (Heegner numbers of the form 4p-1 where p is prime).
 * @author Georg Fischer
 */
public class A199743 extends FiniteSequence {

  /** Construct the sequence. */
  public A199743() {
    super(15, 32, 96, 960, 5280, 640320);
  }
}
