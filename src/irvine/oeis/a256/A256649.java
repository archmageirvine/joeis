package irvine.oeis.a256;

import irvine.oeis.LinearRecurrence;

/**
 * A256649.
 * @author Sean A. Irvine
 */
public class A256649 extends LinearRecurrence {

  /** Construct the sequence. */
  public A256649() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 1, 30, 114});
  }
}
