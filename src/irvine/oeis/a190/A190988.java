package irvine.oeis.a190;

import irvine.oeis.LinearRecurrence;

/**
 * A190988 a(n) = 10*a(n-1) - 6*a(n-2), with a(0)=0, a(1)=1.
 * @author Sean A. Irvine
 */
public class A190988 extends LinearRecurrence {

  /** Construct the sequence. */
  public A190988() {
    super(new long[] {-6, 10}, new long[] {0, 1});
  }
}
