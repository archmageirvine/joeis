package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037693.
 * @author Sean A. Irvine
 */
public class A037693 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037693() {
    super(new long[] {-9, 1, 0, 0, 9}, new long[] {1, 11, 99, 894, 8047});
  }
}
