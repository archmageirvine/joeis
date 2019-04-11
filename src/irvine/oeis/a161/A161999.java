package irvine.oeis.a161;

import irvine.oeis.LinearRecurrence;

/**
 * A161999 For n even <code>a(n) = a(n-1) + 10*a(n-2),</code> for n odd <code>a(n) = a(n-3) + 10 a(n-2)</code>; with <code>a(0) = 0, a(1) = 1</code>.
 * @author Sean A. Irvine
 */
public class A161999 extends LinearRecurrence {

  /** Construct the sequence. */
  public A161999() {
    super(new long[] {-99, 0, 20, 0}, new long[] {0, 1, 1, 10});
  }
}
