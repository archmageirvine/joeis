package irvine.oeis.a177;

import irvine.oeis.LinearRecurrence;

/**
 * A177099.
 * @author Sean A. Irvine
 */
public class A177099 extends LinearRecurrence {

  /** Construct the sequence. */
  public A177099() {
    super(new long[] {1, -3, 3}, new long[] {83, 328, 735});
  }
}
