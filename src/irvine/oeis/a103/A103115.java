package irvine.oeis.a103;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A103115 a(n) = 6*n*(n-1)-1.
 * @author Sean A. Irvine
 */
public class A103115 extends LinearRecurrence {

  /** Construct the sequence. */
  public A103115() {
    super(new long[] {1, -3, 3}, new long[] {-1, -1, 11});
  }
}
