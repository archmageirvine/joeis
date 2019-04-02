package irvine.oeis.a006;

import irvine.oeis.LinearRecurrence;

/**
 * A006357 Number of distributive lattices; also number of paths with n turns when light is reflected from 4 glass plates.
 * @author Sean A. Irvine
 */
public class A006357 extends LinearRecurrence {

  /** Construct the sequence. */
  public A006357() {
    super(new long[] {-1, -1, 3, 2}, new long[] {1, 4, 10, 30});
  }
}

