package irvine.oeis.a027;

import irvine.oeis.LinearRecurrence;

/**
 * A027656.
 * @author Sean A. Irvine
 */
public class A027656 extends LinearRecurrence {

  /** Construct the sequence. */
  public A027656() {
    super(new long[] {-1, 0, 2, 0}, new long[] {1, 0, 2, 0});
  }
}
