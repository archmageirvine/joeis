package irvine.oeis.a055;

import irvine.oeis.LinearRecurrence;

/**
 * A055273.
 * @author Sean A. Irvine
 */
public class A055273 extends LinearRecurrence {

  /** Construct the sequence. */
  public A055273() {
    super(new long[] {-1, 3}, new long[] {1, 8});
  }
}
