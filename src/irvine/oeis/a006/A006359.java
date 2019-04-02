package irvine.oeis.a006;

import irvine.oeis.LinearRecurrence;

/**
 * A006359 Number of distributive lattices; also number of paths with n turns when light is reflected from 6 glass plates.
 * @author Sean A. Irvine
 */
public class A006359 extends LinearRecurrence {

  /** Construct the sequence. */
  public A006359() {
    super(new long[] {1, 1, -5, -4, 6, 3}, new long[] {1, 6, 21, 91, 371, 1547});
  }
}

