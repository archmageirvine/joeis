package irvine.oeis.a103;

import irvine.oeis.LinearRecurrence;

/**
 * A103831 For even <code>n, a(n) = n*(n+1),</code> for odd <code>n, a(n) = 2*n + 1</code>.
 * @author Sean A. Irvine
 */
public class A103831 extends LinearRecurrence {

  /** Construct the sequence. */
  public A103831() {
    super(new long[] {1, 0, -3, 0, 3, 0}, new long[] {0, 3, 6, 7, 20, 11});
  }
}
