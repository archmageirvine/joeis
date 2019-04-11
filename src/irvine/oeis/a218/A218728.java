package irvine.oeis.a218;

import irvine.oeis.LinearRecurrence;

/**
 * A218728 <code>a(n) = (25^n-1)/24</code>.
 * @author Sean A. Irvine
 */
public class A218728 extends LinearRecurrence {

  /** Construct the sequence. */
  public A218728() {
    super(new long[] {-25, 26}, new long[] {0, 1});
  }
}
