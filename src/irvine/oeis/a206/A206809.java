package irvine.oeis.a206;

import irvine.oeis.LinearRecurrence;

/**
 * A206809.
 * @author Sean A. Irvine
 */
public class A206809 extends LinearRecurrence {

  /** Construct the sequence. */
  public A206809() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {7, 52, 208, 608, 1463, 3080});
  }
}
