package irvine.oeis.a220;

import irvine.oeis.LinearRecurrence;

/**
 * A220363.
 * @author Sean A. Irvine
 */
public class A220363 extends LinearRecurrence {

  /** Construct the sequence. */
  public A220363() {
    super(new long[] {-1, -3, 6, 3}, new long[] {1, -1, 4, 3});
  }
}
