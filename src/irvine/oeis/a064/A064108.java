package irvine.oeis.a064;

import irvine.oeis.LinearRecurrence;

/**
 * A064108.
 * @author Sean A. Irvine
 */
public class A064108 extends LinearRecurrence {

  /** Construct the sequence. */
  public A064108() {
    super(new long[] {-20, 21}, new long[] {0, 1});
  }
}
