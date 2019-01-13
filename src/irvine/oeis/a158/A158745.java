package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158745.
 * @author Sean A. Irvine
 */
public class A158745 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158745() {
    super(new long[] {2, 0, 0, -3, 0, 0, 3, 0, 0}, new long[] {1, 2, 3, 3, 5, 4, 8, 9, 7});
  }
}
