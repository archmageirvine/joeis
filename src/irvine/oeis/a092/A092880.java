package irvine.oeis.a092;

import irvine.oeis.LinearRecurrence;

/**
 * A092880 Number of ordered 2-multiantichains on an <code>n-set</code>.
 * @author Sean A. Irvine
 */
public class A092880 extends LinearRecurrence {

  /** Construct the sequence. */
  public A092880() {
    super(new long[] {24, -26, 9}, new long[] {1, 2, 6});
  }
}
