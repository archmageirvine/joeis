package irvine.oeis.a066;

import irvine.oeis.LinearRecurrence;

/**
 * A066530.
 * @author Sean A. Irvine
 */
public class A066530 extends LinearRecurrence {

  /** Construct the sequence. */
  public A066530() {
    super(new long[] {-1, 1, 0, 0, 1}, new long[] {1, 2, 2, 3, 4});
  }
}
