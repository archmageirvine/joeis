package irvine.oeis.a168;

import irvine.oeis.LinearRecurrence;

/**
 * A168206.
 * @author Sean A. Irvine
 */
public class A168206 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168206() {
    super(new long[] {-1, 1, 1}, new long[] {0, 11, 5});
  }
}
