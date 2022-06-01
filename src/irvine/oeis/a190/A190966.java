package irvine.oeis.a190;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A190966 a(n) = 4*a(n-1) - 8*a(n-2), with a(0)=0, a(1)=1.
 * @author Sean A. Irvine
 */
public class A190966 extends LinearRecurrence {

  /** Construct the sequence. */
  public A190966() {
    super(new long[] {-8, 4}, new long[] {0, 1});
  }
}
