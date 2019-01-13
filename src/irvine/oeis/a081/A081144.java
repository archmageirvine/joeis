package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081144.
 * @author Sean A. Irvine
 */
public class A081144 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081144() {
    super(new long[] {-1296, 864, -216, 24}, new long[] {0, 0, 0, 1});
  }
}
