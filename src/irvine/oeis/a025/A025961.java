package irvine.oeis.a025;

import irvine.oeis.LinearRecurrence;

/**
 * A025961.
 * @author Sean A. Irvine
 */
public class A025961 extends LinearRecurrence {

  /** Construct the sequence. */
  public A025961() {
    super(new long[] {-360, 382, -137, 20}, new long[] {1, 20, 263, 2902});
  }
}
