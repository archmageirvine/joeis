package irvine.oeis.a156;

import irvine.oeis.LinearRecurrence;

/**
 * A156796 a(n) = 81*n - 22.
 * @author Sean A. Irvine
 */
public class A156796 extends LinearRecurrence {

  /** Construct the sequence. */
  public A156796() {
    super(new long[] {-1, 2}, new long[] {59, 140});
  }
}
