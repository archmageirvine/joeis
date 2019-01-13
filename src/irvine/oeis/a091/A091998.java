package irvine.oeis.a091;

import irvine.oeis.LinearRecurrence;

/**
 * A091998.
 * @author Sean A. Irvine
 */
public class A091998 extends LinearRecurrence {

  /** Construct the sequence. */
  public A091998() {
    super(new long[] {-1, 1, 1}, new long[] {1, 11, 13});
  }
}
