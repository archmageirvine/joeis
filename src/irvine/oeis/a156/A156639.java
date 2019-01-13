package irvine.oeis.a156;

import irvine.oeis.LinearRecurrence;

/**
 * A156639.
 * @author Sean A. Irvine
 */
public class A156639 extends LinearRecurrence {

  /** Construct the sequence. */
  public A156639() {
    super(new long[] {1, -3, 3}, new long[] {58, 425, 1130});
  }
}
