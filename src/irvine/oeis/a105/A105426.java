package irvine.oeis.a105;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A105426 a(0)=1, a(1)=5, a(n)=8*a(n-1)-a(n-2).
 * @author Sean A. Irvine
 */
public class A105426 extends LinearRecurrence {

  /** Construct the sequence. */
  public A105426() {
    super(new long[] {-1, 8}, new long[] {1, 5});
  }
}
