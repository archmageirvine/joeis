package irvine.oeis.a070;

import irvine.oeis.LinearRecurrence;

/**
 * A070361.
 * @author Sean A. Irvine
 */
public class A070361 extends LinearRecurrence {

  /** Construct the sequence. */
  public A070361() {
    super(new long[] {1, -1, 0, 0, 1}, new long[] {1, 3, 9, 27, 40});
  }
}
