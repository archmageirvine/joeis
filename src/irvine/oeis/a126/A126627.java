package irvine.oeis.a126;

import irvine.oeis.LinearRecurrence;

/**
 * A126627.
 * @author Sean A. Irvine
 */
public class A126627 extends LinearRecurrence {

  /** Construct the sequence. */
  public A126627() {
    super(new long[] {-720, 1764, -1624, 735, -175, 21}, new long[] {7, 49, 343, 2401, 16807, 116929});
  }
}
