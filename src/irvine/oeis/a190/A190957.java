package irvine.oeis.a190;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A190957 a(n) = 10*a(n-1) + 8*a(n-2), with a(0)=0, a(1)=1.
 * @author Sean A. Irvine
 */
public class A190957 extends LinearRecurrence {

  /** Construct the sequence. */
  public A190957() {
    super(new long[] {8, 10}, new long[] {0, 1});
  }
}
