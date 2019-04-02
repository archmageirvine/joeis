package irvine.oeis.a156;

import irvine.oeis.LinearRecurrence;

/**
 * A156198 a(n) = 2*a(n-1)+3 with n&gt;1, a(1)=8.
 * @author Sean A. Irvine
 */
public class A156198 extends LinearRecurrence {

  /** Construct the sequence. */
  public A156198() {
    super(new long[] {-2, 3}, new long[] {8, 19});
  }
}
