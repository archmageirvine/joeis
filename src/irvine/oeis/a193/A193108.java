package irvine.oeis.a193;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A193108 The tetrahedral numbers A000292 mod 10.
 * @author Sean A. Irvine
 */
public class A193108 extends LinearRecurrence {

  /** Construct the sequence. */
  public A193108() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 4, 0, 0, 5, 6, 4, 0, 5, 0, 6, 4, 5, 0, 0, 6, 9, 0, 0, 0});
  }
}
