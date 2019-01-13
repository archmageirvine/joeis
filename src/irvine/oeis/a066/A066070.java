package irvine.oeis.a066;

import irvine.oeis.LinearRecurrence;

/**
 * A066070.
 * @author Sean A. Irvine
 */
public class A066070 extends LinearRecurrence {

  /** Construct the sequence. */
  public A066070() {
    super(new long[] {-1, 0, 2, 0}, new long[] {1, 6, 3, 10});
  }
}
