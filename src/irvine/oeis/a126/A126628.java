package irvine.oeis.a126;

import irvine.oeis.LinearRecurrence;

/**
 * A126628.
 * @author Sean A. Irvine
 */
public class A126628 extends LinearRecurrence {

  /** Construct the sequence. */
  public A126628() {
    super(new long[] {-720, 1764, -1624, 735, -175, 21}, new long[] {8, 62, 470, 3506, 25718, 184682});
  }
}
