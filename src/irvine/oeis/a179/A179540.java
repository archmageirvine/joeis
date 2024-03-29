package irvine.oeis.a179;
// Generated by gen_seq4.pl holose at 2020-04-12 21:28
// egf: (x*exp(-x))/(1-2*x)^(3/2)
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A179540 a(0)=0, a(1)=1, a(n)=2*n*(a(n-1)+a(n-2)), n&gt;1.
 * @author Georg Fischer
 */
public class A179540 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A179540() {
    super(0, "[[0],[2],[2,2],[-1,-1]]", "[0,1,4,30]", 2);
    setGfType(1);
  }
}
