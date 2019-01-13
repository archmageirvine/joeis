package irvine.oeis.a292;

import irvine.oeis.LinearRecurrence;

/**
 * A292616.
 * @author Sean A. Irvine
 */
public class A292616 extends LinearRecurrence {

  /** Construct the sequence. */
  public A292616() {
    super(new long[] {-1, 0, 3, 0}, new long[] {4, 3, 6, 6});
  }
}
