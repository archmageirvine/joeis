package irvine.oeis.a104;

import irvine.oeis.LinearRecurrence;

/**
 * A104769.
 * @author Sean A. Irvine
 */
public class A104769 extends LinearRecurrence {

  /** Construct the sequence. */
  public A104769() {
    super(new long[] {1, 0, -1}, new long[] {0, -1, 1});
  }
}
