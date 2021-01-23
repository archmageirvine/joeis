package irvine.oeis.a154;

import irvine.oeis.LinearRecurrence;

/**
 * A154920 Denominators of a ternary BBP-type formula for log(3).
 * @author Sean A. Irvine
 */
public class A154920 extends LinearRecurrence {

  /** Construct the sequence. */
  public A154920() {
    super(new long[] {-81, 0, 18, 0}, new long[] {1, 18, 27, 324});
  }
}
