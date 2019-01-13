package irvine.oeis.a140;

import irvine.oeis.LinearRecurrence;

/**
 * A140236.
 * @author Sean A. Irvine
 */
public class A140236 extends LinearRecurrence {

  /** Construct the sequence. */
  public A140236() {
    super(new long[] {-1, 10, -45, 120, -210, 252, -210, 120, -45, 10}, new long[] {0, 1, 20, 220, 1540, 7770, 30856, 102340, 295240, 762355});
  }
}
