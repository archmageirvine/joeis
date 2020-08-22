package irvine.oeis.a251;

import irvine.oeis.LinearRecurrence;

/**
 * A251418 Floor((n^2+7n-23)/14).
 * @author Sean A. Irvine
 */
public class A251418 extends LinearRecurrence {

  /** Construct the sequence. */
  public A251418() {
    super(new long[] {1, -2, 1, 0, 0, 0, 0, -1, 2}, new long[] {-2, -2, -1, 0, 1, 2, 3, 5, 6});
  }
}
