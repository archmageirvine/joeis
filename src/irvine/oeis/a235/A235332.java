package irvine.oeis.a235;

import irvine.oeis.LinearRecurrence;

/**
 * A235332 a(n) = n*(9*n + 25)/2 + 6.
 * @author Sean A. Irvine
 */
public class A235332 extends LinearRecurrence {

  /** Construct the sequence. */
  public A235332() {
    super(new long[] {1, -3, 3}, new long[] {6, 23, 49});
  }
}
