package irvine.oeis.a003;

import irvine.oeis.LinearRecurrence;

/**
 * A003729.
 * @author Sean A. Irvine
 */
public class A003729 extends LinearRecurrence {

  /** Construct the sequence. */
  public A003729() {
    super(new long[] {-1, 19, -41, 19}, new long[] {11, 176, 2911, 48301});
  }
}
