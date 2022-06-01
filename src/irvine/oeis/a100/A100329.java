package irvine.oeis.a100;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A100329 a(n) = -a(n-1)-a(n-2)-a(n-3)+a(n-4), a(0)=0, a(1)=1, a(2)=-1, a(3)=0.
 * @author Sean A. Irvine
 */
public class A100329 extends LinearRecurrence {

  /** Construct the sequence. */
  public A100329() {
    super(new long[] {1, -1, -1, -1}, new long[] {0, 1, -1, 0});
  }
}
