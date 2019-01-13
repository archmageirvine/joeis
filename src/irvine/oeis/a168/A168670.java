package irvine.oeis.a168;

import irvine.oeis.LinearRecurrence;

/**
 * A168670.
 * @author Sean A. Irvine
 */
public class A168670 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168670() {
    super(new long[] {-1, 1, 1}, new long[] {1, 8, 12});
  }
}
