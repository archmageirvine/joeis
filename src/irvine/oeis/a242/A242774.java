package irvine.oeis.a242;

import irvine.oeis.LinearRecurrence;

/**
 * A242774 <code>a(n) =</code> ceiling( <code>n / 2 ) +</code> ceiling( <code>n / 3 )</code>.
 * @author Sean A. Irvine
 */
public class A242774 extends LinearRecurrence {

  /** Construct the sequence. */
  public A242774() {
    super(new long[] {-1, 0, 1, 1, 0}, new long[] {2, 2, 3, 4, 5});
  }
}
