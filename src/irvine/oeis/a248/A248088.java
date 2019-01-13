package irvine.oeis.a248;

import irvine.oeis.LinearRecurrence;

/**
 * A248088.
 * @author Sean A. Irvine
 */
public class A248088 extends LinearRecurrence {

  /** Construct the sequence. */
  public A248088() {
    super(new long[] {-27, 0, 0, 4}, new long[] {1, 4, 16, 64});
  }
}
