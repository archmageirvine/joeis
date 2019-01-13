package irvine.oeis.a198;

import irvine.oeis.LinearRecurrence;

/**
 * A198636.
 * @author Sean A. Irvine
 */
public class A198636 extends LinearRecurrence {

  /** Construct the sequence. */
  public A198636() {
    super(new long[] {1, -6, 5}, new long[] {3, 5, 13});
  }
}
