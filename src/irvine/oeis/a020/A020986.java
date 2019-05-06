package irvine.oeis.a020;

import irvine.oeis.PartialSumSequence;

/**
 * A020986 <code>a(n) = n-th</code> partial sum of <code>Golay-Rudin-Shapiro</code> sequence <code>A020985</code>.
 * @author Sean A. Irvine
 */
public class A020986 extends PartialSumSequence {

  /** Construct the sequence. */
  public A020986() {
    super(new A020985());
  }
}
