package irvine.oeis.a180;

import irvine.oeis.LinearRecurrence;

/**
 * A180232 <code>a(n) = n*(17*n - 13)/2</code>.
 * @author Sean A. Irvine
 */
public class A180232 extends LinearRecurrence {

  /** Construct the sequence. */
  public A180232() {
    super(new long[] {1, -3, 3}, new long[] {0, 2, 21});
  }
}
