package irvine.oeis.a289;

import irvine.oeis.LinearRecurrence;

/**
 * A289782.
 * @author Sean A. Irvine
 */
public class A289782 extends LinearRecurrence {

  /** Construct the sequence. */
  public A289782() {
    super(new long[] {1, -7, 2, 4}, new long[] {2, 9, 35, 146});
  }
}
