package irvine.oeis.a131;

import irvine.oeis.LinearRecurrence;

/**
 * A131717.
 * @author Sean A. Irvine
 */
public class A131717 extends LinearRecurrence {

  /** Construct the sequence. */
  public A131717() {
    super(new long[] {-1, 1, 0, 0, 0, 0, 1}, new long[] {1, 2, 3, 5, 4, 6, 7});
  }
}
