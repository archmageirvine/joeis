package irvine.oeis.a049;

import irvine.oeis.LinearRecurrence;

/**
 * A049863.
 * @author Sean A. Irvine
 */
public class A049863 extends LinearRecurrence {

  /** Construct the sequence. */
  public A049863() {
    super(new long[] {1, -1, 0, 2}, new long[] {0, 3, 4, 7});
  }
}
