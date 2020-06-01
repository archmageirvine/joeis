package irvine.oeis.a080;

import irvine.oeis.LinearRecurrence;

/**
 * A080455 <code>a(1)=1;</code> for <code>n&gt;1, a(n) = a(n-1)</code> if n is already in the sequence, <code>a(n) = a(n-1) + 4</code> otherwise.
 * @author Sean A. Irvine
 */
public class A080455 extends LinearRecurrence {

  /** Construct the sequence. */
  public A080455() {
    super(new long[] {-1, 1, 0, 0, 1}, new long[] {1, 5, 9, 13, 13});
  }
}
