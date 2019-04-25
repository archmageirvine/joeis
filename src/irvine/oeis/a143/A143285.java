package irvine.oeis.a143;

import irvine.oeis.LinearRecurrence;

/**
 * A143285 Number of binary words of length n containing at least one subword 1000001 and no subwords <code>10^{i}1</code> with <code>i&lt;5</code>.
 * @author Sean A. Irvine
 */
public class A143285 extends LinearRecurrence {

  /** Construct the sequence. */
  public A143285() {
    super(new long[] {-1, 0, 0, 0, 0, -1, 0, 1, 0, 0, 0, -1, 2}, new long[] {0, 0, 0, 0, 0, 0, 0, 1, 2, 3, 4, 5, 6});
  }
}
