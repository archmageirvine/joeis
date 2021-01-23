package irvine.oeis.a161;

import irvine.oeis.LinearRecurrence;

/**
 * A161999 For n even a(n) = a(n-1) + 10*a(n-2), for n odd a(n) = a(n-3) + 10 a(n-2); with a(0) = 0, a(1) = 1.
 * @author Sean A. Irvine
 */
public class A161999 extends LinearRecurrence {

  /** Construct the sequence. */
  public A161999() {
    super(new long[] {-99, 0, 20, 0}, new long[] {0, 1, 1, 10});
  }
}
