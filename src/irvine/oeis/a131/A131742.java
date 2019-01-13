package irvine.oeis.a131;

import irvine.oeis.LinearRecurrence;

/**
 * A131742.
 * @author Sean A. Irvine
 */
public class A131742 extends LinearRecurrence {

  /** Construct the sequence. */
  public A131742() {
    super(new long[] {-1, 1, -1, 1, 1, -1, 1}, new long[] {0, 0, 1, 2, 0, 0, 4});
  }
}
