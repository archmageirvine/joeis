package irvine.oeis.a182;

import irvine.oeis.LinearRecurrence;

/**
 * A182432 Recurrence <code>a(n)*a(n-2) = a(n-1)*(a(n-1)+3)</code> with <code>a(0) = 1, a(1) = 4</code>.
 * @author Sean A. Irvine
 */
public class A182432 extends LinearRecurrence {

  /** Construct the sequence. */
  public A182432() {
    super(new long[] {1, -9, 9}, new long[] {1, 4, 28});
  }
}
