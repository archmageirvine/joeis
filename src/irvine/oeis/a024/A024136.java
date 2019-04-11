package irvine.oeis.a024;

import irvine.oeis.LinearRecurrence;

/**
 * A024136 <code>a(n) = 11^n - n^9</code>.
 * @author Sean A. Irvine
 */
public class A024136 extends LinearRecurrence {

  /** Construct the sequence. */
  public A024136() {
    super(new long[] {11, -111, 505, -1365, 2430, -2982, 2562, -1530, 615, -155, 21}, new long[] {1, 10, -391, -18352, -247503, -1792074, -8306135, -20866436, 80141153, 1970527202, 24937424601L});
  }
}
