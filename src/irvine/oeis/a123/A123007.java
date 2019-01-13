package irvine.oeis.a123;

import irvine.oeis.LinearRecurrence;

/**
 * A123007.
 * @author Sean A. Irvine
 */
public class A123007 extends LinearRecurrence {

  /** Construct the sequence. */
  public A123007() {
    super(new long[] {9, 2}, new long[] {1, 3});
  }
}
