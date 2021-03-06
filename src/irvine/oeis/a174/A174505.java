package irvine.oeis.a174;
// Generated by gen_seq4.pl holos [[0],[-1],[0],[0],[4],[0],[0],[-4],[0],[0],[1]] [3,1,3,6,1,10,17,1,28,46] 0 at 2019-12-08 00:24
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A174505 Continued fraction expansion for exp( Sum_{n&gt;=1} 1/(n*Lucas(n)) ), where Lucas(n) = A000032(n) = ((1+sqrt(5))/2)^n + ((1-sqrt(5))/2)^n.
 * @author Georg Fischer
 */
public class A174505 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A174505() {
    super(1, "[[0],[-1],[0],[0],[4],[0],[0],[-4],[0],[0],[1]]", "[3,1,3,6,1,10,17,1,28,46]", 0);
  }
}
