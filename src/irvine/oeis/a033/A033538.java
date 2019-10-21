package irvine.oeis.a033;

import irvine.oeis.LinearRecurrence;

/**
 * A033538 <code>a(0)=1, a(1)=1, a(n) = 3*a(n-1) + a(n-2) + 1</code>.
 * @author Sean A. Irvine
 */
public class A033538 extends LinearRecurrence {

  /** Construct the sequence. */
  public A033538() {
    super(new long[] {-1, -2, 4}, new long[] {1, 1, 5});
  }
}
