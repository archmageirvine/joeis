package irvine.oeis.a051;

import irvine.oeis.LinearRecurrence;

/**
 * A051792.
 * @author Sean A. Irvine
 */
public class A051792 extends LinearRecurrence {

  /** Construct the sequence. */
  public A051792() {
    super(new long[] {1, 0, -1, 0}, new long[] {1, 1, 0, 1});
  }
}
