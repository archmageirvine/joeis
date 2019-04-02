package irvine.oeis.a116;

import irvine.oeis.LinearRecurrence;

/**
 * A116556 a(n) = 2*a(n-1) + 2*a(n-2), a(0)=0, a(1)=4.
 * @author Sean A. Irvine
 */
public class A116556 extends LinearRecurrence {

  /** Construct the sequence. */
  public A116556() {
    super(new long[] {2, 2}, new long[] {0, 4});
  }
}
