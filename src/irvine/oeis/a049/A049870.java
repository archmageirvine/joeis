package irvine.oeis.a049;

import irvine.oeis.LinearRecurrence;

/**
 * A049870.
 * @author Sean A. Irvine
 */
public class A049870 extends LinearRecurrence {

  /** Construct the sequence. */
  public A049870() {
    super(new long[] {1, -1, 0, 2}, new long[] {1, 2, 4, 6});
  }
}
