package irvine.oeis.a046;

import irvine.oeis.LinearRecurrence;

/**
 * A046631.
 * @author Sean A. Irvine
 */
public class A046631 extends LinearRecurrence {

  /** Construct the sequence. */
  public A046631() {
    super(new long[] {-3, 1, 0, 3}, new long[] {1, 3, 3, 7});
  }
}
