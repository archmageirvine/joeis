package irvine.oeis.a084;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A084057 a(n) = 2*a(n-1) + 4*a(n-2), a(0)=1, a(1)=1.
 * @author Sean A. Irvine
 */
public class A084057 extends LinearRecurrence {

  /** Construct the sequence. */
  public A084057() {
    super(new long[] {4, 2}, new long[] {1, 1});
  }
}
