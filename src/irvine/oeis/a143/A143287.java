package irvine.oeis.a143;

import irvine.oeis.LinearRecurrence;

/**
 * A143287 Number of binary words of length n containing at least one subword 10^{7}1 and no subwords 10^{i}1 with i&lt;7.
 * @author Sean A. Irvine
 */
public class A143287 extends LinearRecurrence {

  /** Construct the sequence. */
  public A143287() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, -1, 0, 1, 0, 0, 0, 0, 0, -1, 2}, new long[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 2, 3, 4, 5, 6, 7, 8});
  }
}
