package irvine.oeis.a168;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A168361 Period 2: repeat 2, -1.
 * @author Sean A. Irvine
 */
public class A168361 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168361() {
    super(1, new long[] {1, 0}, new long[] {2, -1});
  }
}
