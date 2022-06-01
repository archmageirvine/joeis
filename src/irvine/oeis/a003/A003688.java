package irvine.oeis.a003;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A003688 a(n) = 3*a(n-1) + a(n-2), with a(1)=1 and a(2)=4.
 * @author Sean A. Irvine
 */
public class A003688 extends LinearRecurrence {

  /** Construct the sequence. */
  public A003688() {
    super(new long[] {1, 3}, new long[] {1, 4});
  }
}
