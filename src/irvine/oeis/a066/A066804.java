package irvine.oeis.a066;

import irvine.oeis.LinearRecurrence;

/**
 * A066804.
 * @author Sean A. Irvine
 */
public class A066804 extends LinearRecurrence {

  /** Construct the sequence. */
  public A066804() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1, 8, 34, 100, 235});
  }
}
