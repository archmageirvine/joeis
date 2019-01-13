package irvine.oeis.a054;

import irvine.oeis.LinearRecurrence;

/**
 * A054606.
 * @author Sean A. Irvine
 */
public class A054606 extends LinearRecurrence {

  /** Construct the sequence. */
  public A054606() {
    super(new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {0, 7, 140, 2205, 16408, 78155, 279972, 823585});
  }
}
