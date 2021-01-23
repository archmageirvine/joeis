package irvine.oeis.a143;

import irvine.oeis.LinearRecurrence;

/**
 * A143975 a(n) = floor(n*(n+3)/3).
 * @author Sean A. Irvine
 */
public class A143975 extends LinearRecurrence {

  /** Construct the sequence. */
  public A143975() {
    super(new long[] {1, -2, 1, -1, 2}, new long[] {1, 3, 6, 9, 13});
  }
}
