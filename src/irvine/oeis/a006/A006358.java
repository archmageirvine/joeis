package irvine.oeis.a006;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A006358 Number of distributive lattices; also number of paths with n turns when light is reflected from 5 glass plates.
 * @author Sean A. Irvine
 */
public class A006358 extends LinearRecurrence {

  /** Construct the sequence. */
  public A006358() {
    super(new long[] {1, -1, -4, 3, 3}, new long[] {1, 5, 15, 55, 190});
  }
}

