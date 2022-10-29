package irvine.oeis.a228;

import irvine.oeis.prime.PrimePositionSubsequence;


/**
 * A228130 Numbers n such that (18^n + 5^n)/23 is prime.
 * @author Georg Fischer
 */
public class A228130 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A228130() {
    super("[[0],[-90],[23],[-1]]", "[2, 23]", 0, primeDivTest(23));
  }

}
