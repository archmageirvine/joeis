package irvine.oeis.a257;

import irvine.oeis.LinearRecurrence;

/**
 * A257201.
 * @author Sean A. Irvine
 */
public class A257201 extends LinearRecurrence {

  /** Construct the sequence. */
  public A257201() {
    super(new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {1, 7, 29, 92, 246, 582, 1254, 2508});
  }
}
