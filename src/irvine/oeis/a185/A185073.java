package irvine.oeis.a185;

import irvine.oeis.prime.PrimePositionSubsequence;


/**
 * A185073 Numbers n such that (34^n - 1)/33 is prime.
 * @author Georg Fischer
 */
public class A185073 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A185073() {
    super("[[33],[34],[-1]]", "[0, 33]", 0, primeDivTest(33));
  }

}
