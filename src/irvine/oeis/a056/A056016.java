package irvine.oeis.a056;

import irvine.oeis.LinearRecurrence;

/**
 * A056016.
 * @author Sean A. Irvine
 */
public class A056016 extends LinearRecurrence {

  /** Construct the sequence. */
  public A056016() {
    super(new long[] {-1, -1, -2}, new long[] {1, 1, 1});
  }
}
