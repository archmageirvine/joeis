package irvine.oeis.a328;

import irvine.oeis.prime.PrimePositionSubsequence;


/**
 * A328660 Numbers k such that (10^k + 7^k)/17 is prime.
 * @author Georg Fischer
 */
public class A328660 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A328660() {
    super("[[0],[-70],[17],[-1]]", "[2, 17]", 0, primeDivTest(17));
  }

}
