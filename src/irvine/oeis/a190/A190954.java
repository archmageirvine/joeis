package irvine.oeis.a190;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A190954 a(n) = 10*a(n-1) + 4*a(n-2), with a(0)=0, a(1)=1.
 * @author Sean A. Irvine
 */
public class A190954 extends LinearRecurrence {

  /** Construct the sequence. */
  public A190954() {
    super(new long[] {4, 10}, new long[] {0, 1});
  }
}
