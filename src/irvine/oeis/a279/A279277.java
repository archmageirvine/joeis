package irvine.oeis.a279;

import irvine.oeis.LinearRecurrence;

/**
 * A279277 Composition of Lucas numbers A000032 with Fibonacci numbers A000045.
 * @author Sean A. Irvine
 */
public class A279277 extends LinearRecurrence {

  /** Construct the sequence. */
  public A279277() {
    super(new long[] {-1, -3, 1, 3}, new long[] {1, 4, 12, 37});
  }
}
