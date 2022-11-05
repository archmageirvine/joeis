package irvine.oeis.a173;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A173992 Sequence whose Hankel transform is the Somos (4) sequence.
 * @author Georg Fischer
 */
public class A173992 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A173992() {
    // (n+2)*a(n)+(-4*n-4)*a(n-1)+4*a(n-2)+(12*n-22)*a(n-3)+(-8*n+24)*a(n-4) = 0
    super(0, "[[0],[24,-8],[-22,12],[4],[-4,-4],[2,1]]", "1,1,3", 0);
  }
}
