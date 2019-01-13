package irvine.oeis.a226;

import irvine.oeis.LinearRecurrence;

/**
 * A226097.
 * @author Sean A. Irvine
 */
public class A226097 extends LinearRecurrence {

  /** Construct the sequence. */
  public A226097() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {1447, 1373, 1163, 1097, 911});
  }
}
