package irvine.oeis.a065;

import irvine.oeis.LinearRecurrence;

/**
 * A065260 <code>A057115</code> conjugated with <code>A059893</code>, inverse of <code>A065259</code>.
 * @author Sean A. Irvine
 */
public class A065260 extends LinearRecurrence {

  /** Construct the sequence. */
  public A065260() {
    super(new long[] {-1, 0, 0, 0, 2, 0, 0, 0}, new long[] {2, 4, 1, 8, 6, 12, 3, 16});
  }
}
