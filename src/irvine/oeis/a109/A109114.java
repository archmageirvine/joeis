package irvine.oeis.a109;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A109114 a(n) = 5*a(n-1) - 3*a(n-2), a(0)=1, a(1)=6.
 * @author Sean A. Irvine
 */
public class A109114 extends LinearRecurrence {

  /** Construct the sequence. */
  public A109114() {
    super(new long[] {-3, 5}, new long[] {1, 6});
  }
}
