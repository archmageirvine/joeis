package irvine.oeis.a059;

import irvine.oeis.LinearRecurrence;

/**
 * A059508 Transform of A059502 applied to sequence <code>5,6,7,..</code>.
 * @author Sean A. Irvine
 */
public class A059508 extends LinearRecurrence {

  /** Construct the sequence. */
  public A059508() {
    super(new long[] {-1, 6, -11, 6}, new long[] {5, 11, 29, 79});
  }
}
