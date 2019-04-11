package irvine.oeis.a039;

import irvine.oeis.LinearRecurrence;

/**
 * A039823 <code>a(n) =</code> ceiling( <code>(n^2 + n + 2)/4 )</code>.
 * @author Sean A. Irvine
 */
public class A039823 extends LinearRecurrence {

  /** Construct the sequence. */
  public A039823() {
    super(new long[] {1, -3, 4, -4, 3}, new long[] {1, 2, 4, 6, 8});
  }
}
