package irvine.oeis.a174;

import irvine.oeis.LinearRecurrence;

/**
 * A174007.
 * @author Sean A. Irvine
 */
public class A174007 extends LinearRecurrence {

  /** Construct the sequence. */
  public A174007() {
    super(new long[] {-1, 0, 2, 0}, new long[] {2, 0, 2, -1});
  }
}
