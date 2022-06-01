package irvine.oeis.a116;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A116201 a(n) = a(n-1) + a(n-2) + a(n-3) - a(n-4); a(0)=0, a(1)=1, a(2)=1, a(3)=1.
 * @author Sean A. Irvine
 */
public class A116201 extends LinearRecurrence {

  /** Construct the sequence. */
  public A116201() {
    super(new long[] {-1, 1, 1, 1}, new long[] {0, 1, 1, 1});
  }
}
