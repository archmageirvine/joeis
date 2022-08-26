package irvine.oeis.a089;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A089928 a(n) = 2*a(n-1) + 2*a(n-3) + a(n-4), with a(0)=1, a(1)=2, a(3)=4, a(4)=10.
 * @author Sean A. Irvine
 */
public class A089928 extends LinearRecurrence {

  /** Construct the sequence. */
  public A089928() {
    super(new long[] {1, 2, 0, 2}, new long[] {1, 2, 4, 10});
  }
}
