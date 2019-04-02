package irvine.oeis.a025;

import irvine.oeis.LinearRecurrence;

/**
 * A025030 Number of distributive lattices; also number of paths with n turns when light is reflected from 7 glass plates.
 * @author Sean A. Irvine
 */
public class A025030 extends LinearRecurrence {

  /** Construct the sequence. */
  public A025030() {
    super(new long[] {-1, 1, 6, -5, -10, 6, 4}, new long[] {1, 7, 28, 140, 658, 3164, 15106});
  }
}
