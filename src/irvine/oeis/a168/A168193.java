package irvine.oeis.a168;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A168193 a(n) = a(n-1) + a(n-2) + 4, with a(0)=0, a(1)=2.
 * @author Sean A. Irvine
 */
public class A168193 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168193() {
    super(new long[] {-1, 0, 2}, new long[] {0, 2, 6});
  }
}
