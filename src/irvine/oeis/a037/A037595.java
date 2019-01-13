package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037595.
 * @author Sean A. Irvine
 */
public class A037595 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037595() {
    super(new long[] {-9, 1, 0, 9}, new long[] {1, 9, 84, 757});
  }
}
