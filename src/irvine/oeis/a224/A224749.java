package irvine.oeis.a224;

import irvine.oeis.LinearRecurrence;

/**
 * A224749 Vauban's sequence: <code>a(n)=0</code> if <code>n&lt;=0, a(1)=1</code>; thereafter <code>a(n) = 3*a(n-1) + 6*a(n-2) + 6*a(n-3) + 6*a(n-4) + 6*a(n-5)</code>.
 * @author Sean A. Irvine
 */
public class A224749 extends LinearRecurrence {

  /** Construct the sequence. */
  public A224749() {
    super(new long[] {6, 6, 6, 6, 3}, new long[] {0, 1, 3, 15, 69});
  }
}
