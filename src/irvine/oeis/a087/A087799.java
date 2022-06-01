package irvine.oeis.a087;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A087799 a(n) = 10*a(n-1) - a(n-2), starting with a(0) = 2 and a(1) = 10.
 * @author Sean A. Irvine
 */
public class A087799 extends LinearRecurrence {

  /** Construct the sequence. */
  public A087799() {
    super(new long[] {-1, 10}, new long[] {2, 10});
  }
}
