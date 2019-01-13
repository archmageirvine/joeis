package irvine.oeis.a025;

import irvine.oeis.LinearRecurrence;

/**
 * A025837.
 * @author Sean A. Irvine
 */
public class A025837 extends LinearRecurrence {

  /** Construct the sequence. */
  public A025837() {
    super(new long[] {1, 0, 0, -1, 0, -1, 0, 0, 1, -1, 0, 0, 1, 0, 1, 0, 0}, new long[] {1, 0, 0, 1, 0, 1, 1, 0, 1, 2, 1, 1, 2, 1, 2, 3, 1});
  }
}
