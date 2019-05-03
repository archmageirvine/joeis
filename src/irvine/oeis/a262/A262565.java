package irvine.oeis.a262;

import irvine.oeis.LinearRecurrence;

/**
 * A262565 A weaver's answer to the question "What comes next after <code>2,3,5?"</code>.
 * @author Sean A. Irvine
 */
public class A262565 extends LinearRecurrence {

  /** Construct the sequence. */
  public A262565() {
    super(new long[] {1, -1, 1, -1, 1}, new long[] {2, 3, 5, 5, 3});
  }
}
