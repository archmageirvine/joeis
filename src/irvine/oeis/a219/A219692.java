package irvine.oeis.a219;
// manually apery/holos at 2022-08-07 07:01

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A219692 a(n) = Sum_{j=0..floor(n/3)} (-1)^j C(n,j) * C(2j,j) * C(2n-2j,n-j) * (C(2n-3j-1,n) + C(2n-3j,n)).
 * @author Georg Fischer
 */
public class A219692 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A219692() {
    super(0, "[[0],[-180, 564,-576, 192],[6,-26, 42,-28],[0, 0, 0, 1]]", "[2, 6, 54]", 0);
  }
}
