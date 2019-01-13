package irvine.oeis.a060;

import irvine.oeis.LinearRecurrence;

/**
 * A060352.
 * @author Sean A. Irvine
 */
public class A060352 extends LinearRecurrence {

  /** Construct the sequence. */
  public A060352() {
    super(new long[] {9, -15, 7}, new long[] {2, 17, 80});
  }
}
