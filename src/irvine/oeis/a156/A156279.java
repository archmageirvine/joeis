package irvine.oeis.a156;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A156279 4 times the Lucas number A000032(n).
 * @author Sean A. Irvine
 */
public class A156279 extends LinearRecurrence {

  /** Construct the sequence. */
  public A156279() {
    super(new long[] {1, 1}, new long[] {8, 4});
  }
}
