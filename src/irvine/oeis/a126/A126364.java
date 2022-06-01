package irvine.oeis.a126;
// manually holos at 2021-10-05 14:54

import irvine.oeis.recur.HolonomicRecurrence;
/**
 * A126364 Number of base 10 n-digit numbers with adjacent digits differing by one or less.
 * x^10-10*x^9+36*x^8-48*x^7-14*x^6+84*x^5-35*x^4-36*x^3+18*x^2+4*x-1
 * @author Georg Fischer
 */
public class A126364 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A126364() {
    super(1, "[[0],[-1],[4],[18],[-36],[-35],[84],[-14],[-48],[36],[-10],[1]]", "[10, 28, 80, 230, 664, 1922, 5574, 16188, 47064, 136946]", 0);
  }
}
