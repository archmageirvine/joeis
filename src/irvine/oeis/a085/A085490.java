package irvine.oeis.a085;

import irvine.oeis.LinearRecurrence;

/**
 * A085490 Number of pairs with two different elements which can be obtained by selecting unique elements from two sets with n+1 and n^2 elements respectively and n common elements.
 * @author Sean A. Irvine
 */
public class A085490 extends LinearRecurrence {

  /** Construct the sequence. */
  public A085490() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 1, 10, 33});
  }
}
