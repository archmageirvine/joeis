package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047786 <code>a(n) = (9*n^4 + 4*n^3 - n)/2</code>.
 * @author Sean A. Irvine
 */
public class A047786 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047786() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 6, 87, 417, 1278});
  }
}
