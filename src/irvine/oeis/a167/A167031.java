package irvine.oeis.a167;

import irvine.oeis.LinearRecurrence;

/**
 * A167031.
 * @author Sean A. Irvine
 */
public class A167031 extends LinearRecurrence {

  /** Construct the sequence. */
  public A167031() {
    super(new long[] {64, -84, 21}, new long[] {1, 20, 337});
  }
}
