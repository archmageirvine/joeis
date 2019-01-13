package irvine.oeis.a159;

import irvine.oeis.LinearRecurrence;

/**
 * A159679.
 * @author Sean A. Irvine
 */
public class A159679 extends LinearRecurrence {

  /** Construct the sequence. */
  public A159679() {
    super(new long[] {1, -255, 255}, new long[] {0, 32, 8160});
  }
}
