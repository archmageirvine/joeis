package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157768.
 * @author Sean A. Irvine
 */
public class A157768 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157768() {
    super(new long[] {1, -3, 3}, new long[] {2135, 44608, 141531});
  }
}
