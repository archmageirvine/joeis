package irvine.oeis.a228;

import irvine.oeis.prime.PrimePositionSubsequence;


/**
 * A228573 Numbers n such that (17^n + 16^n)/33 is prime.
 * @author Georg Fischer
 */
public class A228573 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A228573() {
    super("[[0],[-272],[33],[-1]]", "[2, 33]", 0, primeDivTest(33));
  }

}
