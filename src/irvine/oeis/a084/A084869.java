package irvine.oeis.a084;

import irvine.oeis.LinearRecurrence;

/**
 * A084869 Number of 2-multiantichains of <code>an</code> n-set.
 * @author Sean A. Irvine
 */
public class A084869 extends LinearRecurrence {

  /** Construct the sequence. */
  public A084869() {
    super(new long[] {24, -26, 9}, new long[] {1, 2, 5});
  }
}
