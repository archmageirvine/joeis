package irvine.oeis.a176;

import irvine.oeis.LinearRecurrence;

/**
 * A176971.
 * @author Sean A. Irvine
 */
public class A176971 extends LinearRecurrence {

  /** Construct the sequence. */
  public A176971() {
    super(new long[] {1, 0, -1}, new long[] {1, 0, 0});
  }
}
