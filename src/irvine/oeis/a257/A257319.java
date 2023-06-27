package irvine.oeis.a257;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A257319 Numbers n such that the n-th generation of Sawtooth 201 has minimum population in Conway's Game of Life.
 * @author Sean A. Irvine
 */
public class A257319 extends LinearRecurrence {

  /** Construct the sequence. */
  public A257319() {
    super(1, new long[] {-47, 48}, new long[] {0, 1840});
  }
}
