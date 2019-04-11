package irvine.oeis.a147;

import irvine.oeis.LinearRecurrence;

/**
 * A147818 Period 4: repeat <code>[5, 9, 9, 5]</code>.
 * @author Sean A. Irvine
 */
public class A147818 extends LinearRecurrence {

  /** Construct the sequence. */
  public A147818() {
    super(new long[] {1, -1, 1}, new long[] {5, 9, 9});
  }
}
