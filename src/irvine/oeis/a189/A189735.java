package irvine.oeis.a189;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A189735 a(1)=3, a(2)=1, a(n) = 3*a(n-1) + a(n-2).
 * @author Sean A. Irvine
 */
public class A189735 extends LinearRecurrence {

  /** Construct the sequence. */
  public A189735() {
    super(new long[] {1, 3}, new long[] {3, 1});
  }
}
