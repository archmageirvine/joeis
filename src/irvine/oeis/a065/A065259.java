package irvine.oeis.a065;

import irvine.oeis.LinearRecurrence;

/**
 * A065259 <code>A057114</code> conjugated with <code>A059893</code>, inverse of <code>A065260</code>.
 * @author Sean A. Irvine
 */
public class A065259 extends LinearRecurrence {

  /** Construct the sequence. */
  public A065259() {
    super(new long[] {-1, 0, 0, 0, 2, 0, 0, 0}, new long[] {3, 1, 7, 2, 11, 5, 15, 4});
  }
}
