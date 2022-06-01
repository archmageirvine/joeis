package irvine.oeis.a190;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A190975 a(n) = 8*a(n-1) - 2*a(n-2), with a(0)=0, a(1)=1.
 * @author Sean A. Irvine
 */
public class A190975 extends LinearRecurrence {

  /** Construct the sequence. */
  public A190975() {
    super(new long[] {-2, 8}, new long[] {0, 1});
  }
}
