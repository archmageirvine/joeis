package irvine.oeis.a014;

import irvine.oeis.PartialSumSequence;

/**
 * A014140 Apply partial sum operator twice to Catalan numbers.
 * @author Sean A. Irvine
 */
public class A014140 extends PartialSumSequence {

  /** Construct the sequence. */
  public A014140() {
    super(new A014137());
  }
}
