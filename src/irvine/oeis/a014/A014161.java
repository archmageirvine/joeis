package irvine.oeis.a014;

import irvine.oeis.PartialSumSequence;

/**
 * A014161 Apply partial sum operator 4 times to partition numbers.
 * @author Sean A. Irvine
 */
public class A014161 extends PartialSumSequence {

  /** Construct the sequence. */
  public A014161() {
    super(new A014160());
  }
}
