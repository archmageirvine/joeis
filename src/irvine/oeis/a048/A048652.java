package irvine.oeis.a048;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A048652 Continued fraction for Product_{k &gt;= 1} (1-1/2^k) (Cf. A048651).
 * @author Sean A. Irvine
 */
public class A048652 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A048652() {
    super(0, new A048651());
  }
}
