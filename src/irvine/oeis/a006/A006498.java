package irvine.oeis.a006;

import irvine.oeis.LinearRecurrence;

/**
 * A006498 <code>a(n) = a(n-1)+a(n-3)+a(n-4), a(0) = a(1) = a(2) = 1, a(3) = 2</code>.
 * @author Sean A. Irvine
 */
public class A006498 extends LinearRecurrence {

  /** Construct the sequence. */
  public A006498() {
    super(new long[] {1, 1, 0, 1}, new long[] {1, 1, 1, 2});
  }
}

