package irvine.oeis.a090;

import irvine.oeis.LinearRecurrence;

/**
 * A090773.
 * @author Sean A. Irvine
 */
public class A090773 extends LinearRecurrence {

  /** Construct the sequence. */
  public A090773() {
    super(new long[] {-1, 1, 1}, new long[] {4, 6, 14});
  }
}
