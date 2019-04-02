package irvine.oeis.a033;

import irvine.oeis.LinearRecurrence;

/**
 * A033590 (2*n-1)*(3*n-1)*(4*n-1)*(5*n-1).
 * @author Sean A. Irvine
 */
public class A033590 extends LinearRecurrence {

  /** Construct the sequence. */
  public A033590() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1, 24, 945, 6160, 21945});
  }
}
