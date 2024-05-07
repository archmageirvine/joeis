package irvine.oeis.a069;

import irvine.oeis.FiniteSequence;

/**
 * A069563 a(1) = 1, a(2) = 4; for n &gt; 2, a(n) = k*a(n-1) + 1 where k is smallest number &gt; 1 such that k*a(n-1) + 1 is a multiple of n.
 * @author Sean A. Irvine
 */
public class A069563 extends FiniteSequence {

  /** Construct the sequence. */
  public A069563() {
    super(1, FINITE, 1, 4, 9, 28, 85, 426, 3409, 23864, 167049, 1837540, 18375401, 128627808, 1157650273, 10418852458L, 83350819665L, 1250262294976L, 22504721309569L, 382580262262674L, 4973543409414763L, 64656064322391920L);
  }
}
