package irvine.oeis.a198;

import irvine.oeis.LinearRecurrence;

/**
 * A198963 6*9^n-1.
 * @author Sean A. Irvine
 */
public class A198963 extends LinearRecurrence {

  /** Construct the sequence. */
  public A198963() {
    super(new long[] {-9, 10}, new long[] {5, 53});
  }
}
