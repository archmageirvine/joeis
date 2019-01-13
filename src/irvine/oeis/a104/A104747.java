package irvine.oeis.a104;

import irvine.oeis.LinearRecurrence;

/**
 * A104747.
 * @author Sean A. Irvine
 */
public class A104747 extends LinearRecurrence {

  /** Construct the sequence. */
  public A104747() {
    super(new long[] {4, -16, 25, -19, 7}, new long[] {1, 4, 12, 33, 87});
  }
}
