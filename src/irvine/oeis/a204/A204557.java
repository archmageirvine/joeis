package irvine.oeis.a204;

import irvine.oeis.LinearRecurrence;

/**
 * A204557 Right edge of the triangle A045975.
 * @author Sean A. Irvine
 */
public class A204557 extends LinearRecurrence {

  /** Construct the sequence. */
  public A204557() {
    super(new long[] {-1, 1, 3, -3, -3, 3, 1}, new long[] {1, 4, 21, 36, 85, 120, 217});
  }
}
