package irvine.oeis.a077;

import irvine.math.z.Z;
import irvine.oeis.NoncomputableSequence;

/**
 * A077746 Group the natural numbers such that the n-th group contains p(n-1) numbers, where p(n-1) is the product of the members of (n-1)-th group, starting with the first group which has one term: (1), (2), (3, 4), (5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16), (17, 18, ..., 871782912015, 871782912016), ... Sequence contains the sum of the groups.
 * @author Sean A. Irvine
 */
public class A077746 extends NoncomputableSequence {

  /** Construct the sequence. */
  public A077746() {
    // Next term is too large to represent
    super(1, NONCOMPUTABLE, Z.ONE, Z.TWO, Z.SEVEN, Z.valueOf(168), new Z("380002722841984290048000"));
  }
}
