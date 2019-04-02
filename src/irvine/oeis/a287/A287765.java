package irvine.oeis.a287;

import irvine.oeis.LinearRecurrence;

/**
 * A287765 Period 4: repeat [1, 3, 5, 3].
 * @author Sean A. Irvine
 */
public class A287765 extends LinearRecurrence {

  /** Construct the sequence. */
  public A287765() {
    super(new long[] {1, -1, 1}, new long[] {1, 3, 5});
  }
}
