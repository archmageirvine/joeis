package irvine.oeis.a102;

import irvine.oeis.LinearRecurrence;

/**
 * A102902 <code>a(n) = 9a(n-1) - 16a(n-2)</code>.
 * @author Sean A. Irvine
 */
public class A102902 extends LinearRecurrence {

  /** Construct the sequence. */
  public A102902() {
    super(new long[] {-16, 9}, new long[] {1, 9});
  }
}
