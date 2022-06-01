package irvine.oeis.a107;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A107979 a(n) = 4*a(n-1) + 2*a(n-2) for n&gt;1, with a(0)=2, a(1)=9.
 * @author Sean A. Irvine
 */
public class A107979 extends LinearRecurrence {

  /** Construct the sequence. */
  public A107979() {
    super(new long[] {2, 4}, new long[] {2, 9});
  }
}
