package irvine.oeis.a193;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A193942 G.f.: (1+x^4)/(1-x-x^8).
 * @author Sean A. Irvine
 */
public class A193942 extends LinearRecurrence {

  /** Construct the sequence. */
  public A193942() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 1}, new long[] {1, 1, 1, 1, 2, 2, 2, 2});
  }
}
