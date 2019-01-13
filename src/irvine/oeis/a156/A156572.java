package irvine.oeis.a156;

import irvine.oeis.LinearRecurrence;

/**
 * A156572.
 * @author Sean A. Irvine
 */
public class A156572 extends LinearRecurrence {

  /** Construct the sequence. */
  public A156572() {
    super(new long[] {1, -1, 0, -34, 34, 0, 1}, new long[] {289, 529, 1369, 4225, 13225, 42025, 139129});
  }
}
