package irvine.oeis.a135;

import irvine.oeis.LinearRecurrence;

/**
 * A135859 Row sums of triangle <code>A135858</code>.
 * @author Sean A. Irvine
 */
public class A135859 extends LinearRecurrence {

  /** Construct the sequence. */
  public A135859() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 4, 13, 34});
  }
}
