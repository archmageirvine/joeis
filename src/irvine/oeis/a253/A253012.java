package irvine.oeis.a253;

import irvine.oeis.LinearRecurrence;

/**
 * A253012.
 * @author Sean A. Irvine
 */
public class A253012 extends LinearRecurrence {

  /** Construct the sequence. */
  public A253012() {
    super(new long[] {1, -2, 2, -3, 3, -2, 2}, new long[] {1, 1, 1, 2, 3, 4, 5});
  }
}
