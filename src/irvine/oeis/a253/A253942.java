package irvine.oeis.a253;

import irvine.oeis.LinearRecurrence;

/**
 * A253942 <code>a(n) =</code> 3*binomial(n+1, <code>5)</code>.
 * @author Sean A. Irvine
 */
public class A253942 extends LinearRecurrence {

  /** Construct the sequence. */
  public A253942() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {3, 18, 63, 168, 378, 756});
  }
}
