package irvine.oeis.a190;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A190980 a(n) = 9*a(n-1) - 3*a(n-2), with a(0)=0, a(1)=1.
 * @author Sean A. Irvine
 */
public class A190980 extends LinearRecurrence {

  /** Construct the sequence. */
  public A190980() {
    super(new long[] {-3, 9}, new long[] {0, 1});
  }
}
