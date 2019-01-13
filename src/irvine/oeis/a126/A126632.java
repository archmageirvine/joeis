package irvine.oeis.a126;

import irvine.oeis.LinearRecurrence;

/**
 * A126632.
 * @author Sean A. Irvine
 */
public class A126632 extends LinearRecurrence {

  /** Construct the sequence. */
  public A126632() {
    super(new long[] {-720, 1764, -1624, 735, -175, 21}, new long[] {9, 79, 669, 5431, 42189, 314119});
  }
}
