package irvine.oeis.a143;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A143284 Number of binary words of length n containing at least one subword 100001 and no subwords 10^{i}1 with i&lt;4.
 * @author Sean A. Irvine
 */
public class A143284 extends LinearRecurrence {

  /** Construct the sequence. */
  public A143284() {
    super(new long[] {-1, 0, 0, 0, -1, 0, 1, 0, 0, -1, 2}, new long[] {0, 0, 0, 0, 0, 0, 1, 2, 3, 4, 5});
  }
}
