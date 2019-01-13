package irvine.oeis.a026;

import irvine.oeis.LinearRecurrence;

/**
 * A026567.
 * @author Sean A. Irvine
 */
public class A026567 extends LinearRecurrence {

  /** Construct the sequence. */
  public A026567() {
    super(new long[] {-6, 6, 1}, new long[] {1, 4, 13});
  }
}
