package irvine.oeis.a084;

import irvine.oeis.LinearRecurrence;

/**
 * A084219 Inverse binomial transform of A053088.
 * @author Sean A. Irvine
 */
public class A084219 extends LinearRecurrence {

  /** Construct the sequence. */
  public A084219() {
    super(new long[] {4, 0, -3}, new long[] {1, -1, 4});
  }
}
