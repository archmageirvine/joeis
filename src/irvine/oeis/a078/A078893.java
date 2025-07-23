package irvine.oeis.a078;

import irvine.oeis.FilterSequence;

/**
 * A078893 Composite numbers k such that phi(k) - 1 is prime, where phi is Euler's totient function (A000010).
 * @author Sean A. Irvine
 */
public class A078893 extends FilterSequence {

  /** Construct the sequence. */
  public A078893() {
    super(1, new A078892(), NONPRIME);
  }
}
