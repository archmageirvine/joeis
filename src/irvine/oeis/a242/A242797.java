package irvine.oeis.a242;

import irvine.oeis.prime.PrimePositionSubsequence;


/**
 * A242797 Numbers n such that (45^n - 1)/44 is prime.
 * @author Georg Fischer
 */
public class A242797 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A242797() {
    super("[[44],[45],[-1]]", "[0, 44]", 0, primeDivTest(44));
  }

}
