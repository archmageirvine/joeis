package irvine.oeis.a089;

import irvine.oeis.LinearRecurrence;

/**
 * A089908.
 * @author Sean A. Irvine
 */
public class A089908 extends LinearRecurrence {

  /** Construct the sequence. */
  public A089908() {
    super(new long[] {-100, 220, -141, 22}, new long[] {0, 28, 609, 9555});
  }
}
