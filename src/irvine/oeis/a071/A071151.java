package irvine.oeis.a071;

import irvine.oeis.PartialSumSequence;
import irvine.oeis.a000.A000040;
import irvine.oeis.prime.PrimeSubsequence;

/**
 * A013918.
 * @author Sean A. Irvine
 */
public class A071151 extends PrimeSubsequence {

  /** Construct the sequence. */
  public A071151() {
    super(new PartialSumSequence(new A000040().skip()));
  }
}
