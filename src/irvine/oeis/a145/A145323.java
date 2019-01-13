package irvine.oeis.a145;

import irvine.oeis.LinearRecurrence;

/**
 * A145323.
 * @author Sean A. Irvine
 */
public class A145323 extends LinearRecurrence {

  /** Construct the sequence. */
  public A145323() {
    super(new long[] {1, -24303, 24303}, new long[] {22, 546817, 13288758862L});
  }
}
