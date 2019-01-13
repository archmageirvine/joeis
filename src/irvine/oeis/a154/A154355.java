package irvine.oeis.a154;

import irvine.oeis.LinearRecurrence;

/**
 * A154355.
 * @author Sean A. Irvine
 */
public class A154355 extends LinearRecurrence {

  /** Construct the sequence. */
  public A154355() {
    super(new long[] {1, -3, 3}, new long[] {13, 2, 41});
  }
}
