package irvine.oeis.a002;

import irvine.oeis.LinearRecurrence;

/**
 * A002965 Interleave denominators <code>(A000129)</code> and numerators <code>(A001333)</code> of convergents to <code>sqrt(2)</code>.
 * @author Sean A. Irvine
 */
public class A002965 extends LinearRecurrence {

  /** Construct the sequence. */
  public A002965() {
    super(new long[] {1, 0, 2, 0}, new long[] {0, 1, 1, 1});
  }
}
