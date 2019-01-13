package irvine.oeis.a122;

import irvine.oeis.LinearRecurrence;

/**
 * A122502.
 * @author Sean A. Irvine
 */
public class A122502 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122502() {
    super(new long[] {38, 54, 22, 0}, new long[] {0, 1, 0, 22});
  }
}
