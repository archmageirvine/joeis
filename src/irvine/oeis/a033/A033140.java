package irvine.oeis.a033;

import irvine.oeis.LinearRecurrence;

/**
 * A033140.
 * @author Sean A. Irvine
 */
public class A033140 extends LinearRecurrence {

  /** Construct the sequence. */
  public A033140() {
    super(new long[] {-4, 1, 0, 4}, new long[] {1, 4, 16, 65});
  }
}
