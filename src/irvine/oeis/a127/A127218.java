package irvine.oeis.a127;
// Generated by gen_seq4.pl holos at 2020-10-26 23:20
// 4: 10
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;


/**
 * A127218 Half-indexed Lucas numbers second version L(n)=A000032=Lucas numbers a(0)=2, a(1)=2, a(2)=1, a(3)=2, a(4)=3, a(5)=3, a(2n)=L(n), for n&gt;2: a(2n+1)=L(n)+L(n-3)=2*L(n-1) for n&gt;5: a(n)+a(n+2)=a(n+4) a(2n)=L(n), so a(n)=L(n/2).
 * @author Georg Fischer
 */
public class A127218 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A127218() {
    super(0, "[[0],[1],[0],[1],[0],[-1]]", "[2, 2, 1, 2, 3, 3, 4, 6, 7, 8]", 0);
  }
}
