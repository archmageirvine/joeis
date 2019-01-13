package irvine.oeis.a256;

import irvine.oeis.LinearRecurrence;

/**
 * A256645.
 * @author Sean A. Irvine
 */
public class A256645 extends LinearRecurrence {

  /** Construct the sequence. */
  public A256645() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 1, 26, 98});
  }
}
