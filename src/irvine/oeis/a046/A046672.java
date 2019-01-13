package irvine.oeis.a046;

import irvine.oeis.LinearRecurrence;

/**
 * A046672.
 * @author Sean A. Irvine
 */
public class A046672 extends LinearRecurrence {

  /** Construct the sequence. */
  public A046672() {
    super(new long[] {-2, 3, 2}, new long[] {1, 2, 7});
  }
}
