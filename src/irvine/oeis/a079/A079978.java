package irvine.oeis.a079;

import irvine.oeis.LinearRecurrence;

/**
 * A079978 Characteristic function of multiples of three.
 * @author Sean A. Irvine
 */
public class A079978 extends LinearRecurrence {

  /** Construct the sequence. */
  public A079978() {
    super(new long[] {1, 0, 0}, new long[] {1, 0, 0});
  }
}
