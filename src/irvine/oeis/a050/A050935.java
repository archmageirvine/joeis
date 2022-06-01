package irvine.oeis.a050;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A050935 a(1)=0, a(2)=0, a(3)=1, a(n+1) = a(n) - a(n-2).
 * @author Sean A. Irvine
 */
public class A050935 extends LinearRecurrence {

  /** Construct the sequence. */
  public A050935() {
    super(new long[] {-1, 0, 1}, new long[] {0, 0, 1});
  }
}
