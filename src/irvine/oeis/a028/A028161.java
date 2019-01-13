package irvine.oeis.a028;

import irvine.oeis.LinearRecurrence;

/**
 * A028161.
 * @author Sean A. Irvine
 */
public class A028161 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028161() {
    super(new long[] {-3960, 2186, -419, 34}, new long[] {1, 34, 737, 12998});
  }
}
