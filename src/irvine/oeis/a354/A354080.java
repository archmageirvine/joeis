package irvine.oeis.a354;
// Generated by gen_seq4.pl holsig/holos at 2022-09-29 21:58

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A354080 a(n) = a(n-1) + a(n-2) + a(n-3), with a(0)=1, a(1)=4, a(2)=5.
 * @author Georg Fischer
 */
public class A354080 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A354080() {
    super(0, "[0,1,1,1,-1]", "1,4,5,10", 0);
  }
}
