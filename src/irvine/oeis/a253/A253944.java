package irvine.oeis.a253;

import irvine.oeis.LinearRecurrence;

/**
 * A253944 <code>a(n) =</code> 3*binomial(n+1,7).
 * @author Sean A. Irvine
 */
public class A253944 extends LinearRecurrence {

  /** Construct the sequence. */
  public A253944() {
    super(new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {3, 24, 108, 360, 990, 2376, 5148, 10296});
  }
}
