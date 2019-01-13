package irvine.oeis.a168;

import irvine.oeis.LinearRecurrence;

/**
 * A168636.
 * @author Sean A. Irvine
 */
public class A168636 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168636() {
    super(new long[] {-1, 10, -45, 120, -210, 252, -210, 120, -45, 10}, new long[] {0, 1, 320, 10935, 139264, 1015625, 5178816, 20588575, 68157440, 196101729});
  }
}
