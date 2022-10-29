package irvine.oeis.a245;

import irvine.oeis.prime.PrimePositionSubsequence;


/**
 * A245442 Numbers n such that (50^n - 1)/49 is prime.
 * @author Georg Fischer
 */
public class A245442 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A245442() {
    super("[[49],[50],[-1]]", "[0, 49]", 0, primeDivTest(49));
  }

}
