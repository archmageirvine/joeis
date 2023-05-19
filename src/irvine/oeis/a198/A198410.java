package irvine.oeis.a198;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A198410 a(n) = ((3^(n-1) + 1)^3 -1)/3^n.
 * @author Sean A. Irvine
 */
public class A198410 extends LinearRecurrence {

  /** Construct the sequence. */
  public A198410() {
    super(new long[] {27, -39, 13}, new long[] {7, 37, 271});
  }
}
