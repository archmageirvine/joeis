package irvine.oeis.a190;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A190139 a(n) = 2*a(n-1) + a(n-2) + a(n-3) + a(n-4), a(-2)=0, a(-1)=0, a(0)=1, a(1)=1.
 * @author Sean A. Irvine
 */
public class A190139 extends LinearRecurrence {

  /** Construct the sequence. */
  public A190139() {
    super(new long[] {1, 1, 1, 2}, new long[] {1, 1, 3, 8});
  }
}
