package irvine.oeis.a242;

import irvine.oeis.LinearRecurrence;

/**
 * A242537.
 * @author Sean A. Irvine
 */
public class A242537 extends LinearRecurrence {

  /** Construct the sequence. */
  public A242537() {
    super(new long[] {-2, 2, 3, 2}, new long[] {1, 3, 8, 27});
  }
}
