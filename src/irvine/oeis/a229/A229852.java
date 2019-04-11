package irvine.oeis.a229;

import irvine.oeis.LinearRecurrence;

/**
 * A229852 3*h^2, where h is <code>an</code> odd integer not divisible by 3.
 * @author Sean A. Irvine
 */
public class A229852 extends LinearRecurrence {

  /** Construct the sequence. */
  public A229852() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {3, 75, 147, 363, 507});
  }
}
