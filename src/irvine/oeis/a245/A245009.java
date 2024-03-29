package irvine.oeis.a245;
// Generated by gen_seq4.pl holos at 2021-05-20 21:38
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A245009 G.f. satisfies: A(x) = (7 + A(x)^4) / (8 - 8*x).
 * @author Georg Fischer
 */
public class A245009 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A245009() {
    super(0, "[[0],[-9360, 10896,-3888, 432],[24240,-31296, 12960,-1728],[-20064, 30768,-15552, 2592],[5184,-11232, 7776,-1728],[0, 178,-267, 89]]", "[1, 2, 10, 88]", 0);
  }
}
