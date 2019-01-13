package irvine.oeis.a126;

import irvine.oeis.LinearRecurrence;

/**
 * A126631.
 * @author Sean A. Irvine
 */
public class A126631 extends LinearRecurrence {

  /** Construct the sequence. */
  public A126631() {
    super(new long[] {-720, 1764, -1624, 735, -175, 21}, new long[] {9, 77, 633, 5021, 38409, 283277});
  }
}
