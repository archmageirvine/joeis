package irvine.oeis.a190;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A190976 a(n) = 8*a(n-1) - 3*a(n-2), with a(0)=0, a(1)=1.
 * @author Sean A. Irvine
 */
public class A190976 extends LinearRecurrence {

  /** Construct the sequence. */
  public A190976() {
    super(new long[] {-3, 8}, new long[] {0, 1});
  }
}
