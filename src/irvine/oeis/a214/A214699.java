package irvine.oeis.a214;

import irvine.oeis.LinearRecurrence;

/**
 * A214699.
 * @author Sean A. Irvine
 */
public class A214699 extends LinearRecurrence {

  /** Construct the sequence. */
  public A214699() {
    super(new long[] {-1, 3, 0}, new long[] {0, 3, 0});
  }
}
