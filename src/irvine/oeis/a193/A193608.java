package irvine.oeis.a193;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A193608 The consecutive squares of numbers multiplied by their next consecutive integer.
 * @author Sean A. Irvine
 */
public class A193608 extends LinearRecurrence {

  /** Construct the sequence. */
  public A193608() {
    super(1, new long[] {-1, 4, -6, 4}, new long[] {15, 52, 125, 246});
  }
}
