package irvine.oeis.a361;
// Generated by gen_seq4.pl holon at 2023-12-14 17:23

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A361532 Expansion of e.g.f. exp((x + x^2/2)/(1-x)).
 * exp((x+1/2*x^2)/(1-x))
 * @author Georg Fischer
 */
public class A361532 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A361532() {
    super(0, "[[0],[1],[-6,2],[2,-4],[0,2]]", "1,1,4,19,118,886", 0, EGF);
  }
}
