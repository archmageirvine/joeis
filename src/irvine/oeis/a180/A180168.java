package irvine.oeis.a180;

import irvine.oeis.LinearRecurrence;

/**
 * A180168 <code>a(n) = 2*a(n-1) + 5*a(n-2), a(0) = 1, a(1) = 3</code>.
 * @author Sean A. Irvine
 */
public class A180168 extends LinearRecurrence {

  /** Construct the sequence. */
  public A180168() {
    super(new long[] {5, 2}, new long[] {1, 3});
  }
}
