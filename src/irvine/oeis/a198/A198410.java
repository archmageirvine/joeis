package irvine.oeis.a198;

import irvine.oeis.LinearRecurrence;

/**
 * A198410.
 * @author Sean A. Irvine
 */
public class A198410 extends LinearRecurrence {

  /** Construct the sequence. */
  public A198410() {
    super(new long[] {27, -39, 13}, new long[] {7, 37, 271});
  }
}
