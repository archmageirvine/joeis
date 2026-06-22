package irvine.oeis.a006;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A006359 Number of antichains in the product of a fence poset with n elements and a chain with 5 elements; also number of paths with n turns when light is reflected from 6 glass plates.
 * @author Sean A. Irvine
 */
public class A006359 extends LinearRecurrence {

  /** Construct the sequence. */
  public A006359() {
    super(new long[] {1, 1, -5, -4, 6, 3}, new long[] {1, 6, 21, 91, 371, 1547});
  }
}

