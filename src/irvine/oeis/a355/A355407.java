package irvine.oeis.a355;
// Generated by gen_seq4.pl holon at 2023-12-19 20:39

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A355407 Expansion of the e.g.f. log((1 - x) / (1 - 2*x)) / (1 - x)^4.
 * ln((1-x)/(1-2*x))/(1-x)^4
 * @author Georg Fischer
 */
public class A355407 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A355407() {
    super(0, "[[0],[4,6,2],[8,-6,-5],[-3,-1,4],[0,1,-1]]", "0,1,11,110,1154,13144", 0, EGF);
  }
}
