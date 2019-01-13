package irvine.oeis.a072;

import irvine.oeis.LinearRecurrence;

/**
 * A072065.
 * @author Sean A. Irvine
 */
public class A072065 extends LinearRecurrence {

  /** Construct the sequence. */
  public A072065() {
    super(new long[] {-1, 1, 0, 0, 1}, new long[] {0, 2, 9, 11, 12});
  }
}
