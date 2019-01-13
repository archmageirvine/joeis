package irvine.oeis.a220;

import irvine.oeis.LinearRecurrence;

/**
 * A220185.
 * @author Sean A. Irvine
 */
public class A220185 extends LinearRecurrence {

  /** Construct the sequence. */
  public A220185() {
    super(new long[] {1, -35, 35}, new long[] {0, 10, 348});
  }
}
