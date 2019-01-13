package irvine.oeis.a014;

import irvine.oeis.LinearRecurrence;

/**
 * A014921.
 * @author Sean A. Irvine
 */
public class A014921 extends LinearRecurrence {

  /** Construct the sequence. */
  public A014921() {
    super(new long[] {64, -80, 17}, new long[] {1, 17, 209});
  }
}
