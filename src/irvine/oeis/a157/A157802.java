package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157802 a(n) = 27225*n^2 - 51302*n + 24168.
 * @author Sean A. Irvine
 */
public class A157802 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157802() {
    super(new long[] {1, -3, 3}, new long[] {91, 30464, 115287});
  }
}
