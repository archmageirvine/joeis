package irvine.oeis.a087;

import irvine.oeis.InverseSequence;

/**
 * A087228 a(n) is the smallest number k such that the LCM of the terms of the Collatz trajectory of k has n distinct prime factors.
 * @author Sean A. Irvine
 */
public class A087228 extends InverseSequence {

  /** Construct the sequence. */
  public A087228() {
    super(1, new A087227());
  }
}
