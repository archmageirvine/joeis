package irvine.oeis.a290;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A290968 a(n) = a(n-1) + a(n-2) - a(n-3) + a(n-4) + a(n-5), with a(0)=a(1)=a(2)=1, a(3)=-1 and a(4)=1.
 * @author Sean A. Irvine
 */
public class A290968 extends LinearRecurrence {

  /** Construct the sequence. */
  public A290968() {
    super(new long[] {1, 1, -1, 1, 1}, new long[] {1, 1, 1, -1, 1});
  }
}
