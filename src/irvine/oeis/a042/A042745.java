package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042745.
 * @author Sean A. Irvine
 */
public class A042745 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042745() {
    super(new long[] {-1, 0, 1202, 0}, new long[] {1, 20, 1201, 24040});
  }
}
