package irvine.oeis.a143;

import irvine.oeis.LinearRecurrence;

/**
 * A143286 Number of binary words of length n containing at least one subword <code>10^{6}1</code> and no subwords <code>10^{i}1</code> with <code>i&lt;6</code>.
 * @author Sean A. Irvine
 */
public class A143286 extends LinearRecurrence {

  /** Construct the sequence. */
  public A143286() {
    super(new long[] {-1, 0, 0, 0, 0, 0, -1, 0, 1, 0, 0, 0, 0, -1, 2}, new long[] {0, 0, 0, 0, 0, 0, 0, 0, 1, 2, 3, 4, 5, 6, 7});
  }
}
