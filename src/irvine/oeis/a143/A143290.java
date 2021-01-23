package irvine.oeis.a143;

import irvine.oeis.LinearRecurrence;

/**
 * A143290 Number of binary words of length n containing at least one subword 10^{10}1 and no subwords 10^{i}1 with i&lt;10.
 * @author Sean A. Irvine
 */
public class A143290 extends LinearRecurrence {

  /** Construct the sequence. */
  public A143290() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 2}, new long[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11});
  }
}
