package irvine.oeis.a090;

import irvine.oeis.LinearRecurrence;

/**
 * A090386.
 * @author Sean A. Irvine
 */
public class A090386 extends LinearRecurrence {

  /** Construct the sequence. */
  public A090386() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 24, 64, 126, 217});
  }
}
