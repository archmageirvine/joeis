package irvine.oeis.a177;
// Generated by gen_seq4.pl holos [[0,0],[-200,40],[452,-112],[-306,99],[51,-21],[2,-7],[1,1]] [1,10,19,137,653] 0 at 2020-01-24 16:04
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A177167 Sequence defined by the recurrence formula a(n+1)=sum(a(p)*a(n-p)+k,p=0..n)+l for n&gt;=1, with here a(0)=1, a(1)=10, k=0 and l=-1.
 * @author Georg Fischer
 */
public class A177167 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A177167() {
    super(0, "[[0,0],[-200,40],[452,-112],[-306,99],[51,-21],[2,-7],[1,1]]", "[1,10,19,137,653]", 0);
  }
}
