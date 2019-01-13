package irvine.oeis.a289;

import irvine.oeis.LinearRecurrence;

/**
 * A289254.
 * @author Sean A. Irvine
 */
public class A289254 extends LinearRecurrence {

  /** Construct the sequence. */
  public A289254() {
    super(new long[] {4, -9, 6}, new long[] {0, 9, 54});
  }
}
