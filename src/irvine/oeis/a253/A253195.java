package irvine.oeis.a253;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A253195 Numbers congruent to 5 or 8 mod 9.
 * @author Sean A. Irvine
 */
public class A253195 extends LinearRecurrence {

  /** Construct the sequence. */
  public A253195() {
    super(1, new long[] {-1, 1, 1}, new long[] {5, 8, 14});
  }
}
