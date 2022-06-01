package irvine.oeis.a080;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A080424 a(n) = 3*a(n-1) + 18*a(n-2), a(0)=0, a(1)=1.
 * @author Sean A. Irvine
 */
public class A080424 extends LinearRecurrence {

  /** Construct the sequence. */
  public A080424() {
    super(new long[] {18, 3}, new long[] {0, 1});
  }
}
