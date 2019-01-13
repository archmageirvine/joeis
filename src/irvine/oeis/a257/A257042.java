package irvine.oeis.a257;

import irvine.oeis.LinearRecurrence;

/**
 * A257042.
 * @author Sean A. Irvine
 */
public class A257042 extends LinearRecurrence {

  /** Construct the sequence. */
  public A257042() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 10, 52, 144});
  }
}
