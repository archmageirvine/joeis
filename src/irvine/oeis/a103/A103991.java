package irvine.oeis.a103;
// Generated by gen_seq4.pl 2024-11-01.ack/holos at 2024-11-01 22:07

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A103991 Reduced denominators of the hypercube line-picking integrand sqrt(Pi)*I(n,0).
 * -x*(3*x^5-x^4-3*x^3-21*x^2-5*x-3)/(x-1)^2/(x^2+x+1)^2
 * @author Georg Fischer
 */
public class A103991 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A103991() {
    super(1, "[[0],[-24,3],[6,-1],[12,-3],[75,-24],[-9,-4],[-27],[-105,21],[-15,5],[-3,3]]", "3,5,21,9,11,39,15,17,57,21", 0, 0);
  }
}
