package irvine.oeis.a191;

import irvine.oeis.FiniteSequence;

/**
 * A191616 a(1) = 1; a(n) is the largest number m such that m-A085392(m) = a(n-1).
 * @author Georg Fischer
 */
public class A191616 extends FiniteSequence {

  /** Construct the sequence. */
  public A191616() {
    super(1, 2, 4, 5, 10, 15, 20, 25, 30, 32);
  }
}
