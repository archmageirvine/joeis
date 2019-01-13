package irvine.oeis.a249;

import irvine.oeis.LinearRecurrence;

/**
 * A249221.
 * @author Sean A. Irvine
 */
public class A249221 extends LinearRecurrence {

  /** Construct the sequence. */
  public A249221() {
    super(new long[] {-2, 0, 6, 0}, new long[] {1, 5, 6, 28});
  }
}
