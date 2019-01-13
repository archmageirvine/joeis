package irvine.oeis.a072;

import irvine.oeis.LinearRecurrence;

/**
 * A072703.
 * @author Sean A. Irvine
 */
public class A072703 extends LinearRecurrence {

  /** Construct the sequence. */
  public A072703() {
    super(new long[] {-1, 1, 1}, new long[] {5, 10, 20});
  }
}
