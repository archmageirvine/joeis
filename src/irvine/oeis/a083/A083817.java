package irvine.oeis.a083;

import irvine.oeis.LinearRecurrence;

/**
 * A083817.
 * @author Sean A. Irvine
 */
public class A083817 extends LinearRecurrence {

  /** Construct the sequence. */
  public A083817() {
    super(new long[] {1, 0, 0, -3, 0, 0, 3, 0, 0}, new long[] {1, 2, 0, 2, 2, 1, 3, 2, 3});
  }
}
