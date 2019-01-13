package irvine.oeis.a086;

import irvine.oeis.LinearRecurrence;

/**
 * A086514.
 * @author Sean A. Irvine
 */
public class A086514 extends LinearRecurrence {

  /** Construct the sequence. */
  public A086514() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 2, 3, 6});
  }
}
