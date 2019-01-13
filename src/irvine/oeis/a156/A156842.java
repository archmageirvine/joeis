package irvine.oeis.a156;

import irvine.oeis.LinearRecurrence;

/**
 * A156842.
 * @author Sean A. Irvine
 */
public class A156842 extends LinearRecurrence {

  /** Construct the sequence. */
  public A156842() {
    super(new long[] {1, -3, 3}, new long[] {46, 887, 2786});
  }
}
