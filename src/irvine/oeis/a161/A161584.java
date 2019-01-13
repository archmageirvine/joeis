package irvine.oeis.a161;

import irvine.oeis.LinearRecurrence;

/**
 * A161584.
 * @author Sean A. Irvine
 */
public class A161584 extends LinearRecurrence {

  /** Construct the sequence. */
  public A161584() {
    super(new long[] {1, -224, 224}, new long[] {0, 15, 3360});
  }
}
