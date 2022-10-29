package irvine.oeis.a235;

import irvine.oeis.prime.PrimePositionSubsequence;


/**
 * A235683 Numbers n such that (46^n + 1)/47 is prime.
 * @author Georg Fischer
 */
public class A235683 extends PrimePositionSubsequence {

  /** Construct the sequence. */
  public A235683() {
    super("[[-45],[46],[-1]]", "[2, 47]", 0, primeDivTest(47));
  }

}
