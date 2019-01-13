package irvine.oeis.a252;

import irvine.oeis.LinearRecurrence;

/**
 * A252747.
 * @author Sean A. Irvine
 */
public class A252747 extends LinearRecurrence {

  /** Construct the sequence. */
  public A252747() {
    super(new long[] {1, -1, -34, 34, 1}, new long[] {18, 42, 602, 1418, 20442});
  }
}
