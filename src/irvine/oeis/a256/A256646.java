package irvine.oeis.a256;

import irvine.oeis.LinearRecurrence;

/**
 * A256646.
 * @author Sean A. Irvine
 */
public class A256646 extends LinearRecurrence {

  /** Construct the sequence. */
  public A256646() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 1, 27, 102});
  }
}
