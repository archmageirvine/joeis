package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157362.
 * @author Sean A. Irvine
 */
public class A157362 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157362() {
    super(new long[] {1, -3, 3}, new long[] {47, 192, 435});
  }
}
