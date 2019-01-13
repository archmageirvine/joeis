package irvine.oeis.a271;

import irvine.oeis.LinearRecurrence;

/**
 * A271994.
 * @author Sean A. Irvine
 */
public class A271994 extends LinearRecurrence {

  /** Construct the sequence. */
  public A271994() {
    super(new long[] {-1, 2, 1, -4, 1, 2}, new long[] {8, 16, 34, 52, 84, 116});
  }
}
