package irvine.oeis.a172;

import irvine.oeis.LinearRecurrence;

/**
 * A172244 Integers (up to a sign) that are not representable in the form <code>2x^2 +</code> xy + 3y^2 + z^3 - z for integer x,y,z.
 * @author Sean A. Irvine
 */
public class A172244 extends LinearRecurrence {

  /** Construct the sequence. */
  public A172244() {
    super(new long[] {-1, 0, 15550, 0}, new long[] {1, 599, 14951, 9314449});
  }
}
