package irvine.oeis.a076;

import irvine.oeis.LinearRecurrence;

/**
 * A076453 <code>a(n+2) =</code> abs(a(n+1)) <code>- a(n), a(0)=1, a(1)=0</code>.
 * @author Sean A. Irvine
 */
public class A076453 extends LinearRecurrence {

  /** Construct the sequence. */
  public A076453() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 0, -1, 1, 2, 1, -1, 0, 1});
  }
}
