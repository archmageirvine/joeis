package irvine.oeis.a179;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A179298 a(n)=n^3-(n-1)^3-(n-2)^3-...-1.
 * @author Sean A. Irvine
 */
public class A179298 extends LinearRecurrence {

  /** Construct the sequence. */
  public A179298() {
    super(1, new long[] {1, -5, 10, -10, 5}, new long[] {1, 7, 18, 28, 25});
  }
}
