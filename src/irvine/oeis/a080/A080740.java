package irvine.oeis.a080;

import irvine.oeis.PartialSumSequence;

/**
 * A080740 a(n) = number of m such that A080737(m) &lt;= 2n.
 * @author Sean A. Irvine
 */
public class A080740 extends PartialSumSequence {

  /** Construct the sequence. */
  public A080740() {
    super(1, new A080739());
  }
}
