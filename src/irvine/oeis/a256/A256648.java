package irvine.oeis.a256;

import irvine.oeis.LinearRecurrence;

/**
 * A256648.
 * @author Sean A. Irvine
 */
public class A256648 extends LinearRecurrence {

  /** Construct the sequence. */
  public A256648() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 1, 29, 110});
  }
}
