package irvine.oeis.a277;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A277131 Magic numbers of anti-Mackay icosahedra.
 * @author Sean A. Irvine
 */
public class A277131 extends LinearRecurrence {

  /** Construct the sequence. */
  public A277131() {
    super(new long[] {-1, 4, -6, 4}, new long[] {45, 127, 279, 521});
  }
}
