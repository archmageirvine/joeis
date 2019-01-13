package irvine.oeis.a232;

import irvine.oeis.LinearRecurrence;

/**
 * A232449.
 * @author Sean A. Irvine
 */
public class A232449 extends LinearRecurrence {

  /** Construct the sequence. */
  public A232449() {
    super(new long[] {1000, -1110, 111}, new long[] {16661, 1066601, 100666001});
  }
}
