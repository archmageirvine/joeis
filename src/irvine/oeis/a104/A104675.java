package irvine.oeis.a104;

import irvine.oeis.LinearRecurrence;

/**
 * A104675 <code>a(n) = C(n+1,n) * C(n+6,1)</code>.
 * @author Sean A. Irvine
 */
public class A104675 extends LinearRecurrence {

  /** Construct the sequence. */
  public A104675() {
    super(new long[] {1, -3, 3}, new long[] {6, 14, 24});
  }
}
