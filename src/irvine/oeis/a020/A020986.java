package irvine.oeis.a020;

import irvine.oeis.PartialSumSequence;

/**
 * A020986 a(n) = n-th partial sum of Golay-Rudin-Shapiro sequence A020985.
 * @author Sean A. Irvine
 */
public class A020986 extends PartialSumSequence {

  /** Construct the sequence. */
  public A020986() {
    super(new A020985());
  }
}
