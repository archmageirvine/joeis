package irvine.oeis.a046;

import irvine.oeis.LinearRecurrence;

/**
 * A046718.
 * @author Sean A. Irvine
 */
public class A046718 extends LinearRecurrence {

  /** Construct the sequence. */
  public A046718() {
    super(new long[] {-16, 32, -24, 8}, new long[] {1, 4, 14, 47});
  }
}
