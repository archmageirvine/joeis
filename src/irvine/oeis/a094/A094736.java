package irvine.oeis.a094;
// Generated by gen_seq4.pl lingf at 2020-04-15 21:52
// ogf: x*(1-62*x+1651*x^2-24816*x^3+233562*x^4-1431634*x^5+5791471*x^6-15717948*x^7+28663875*x^8-28066500*x^9)/((1-x)*(1-2*x)*(1-3*x)*(1-4*x)*(1-5*x)*(1-6*x)*(1-7*x)*(1-9*x)*(1-11*x)*(1-15*x))
// DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A094736 Number of connected 4-element multiantichains on a labeled n-set.
 * @author Georg Fischer
 */
public class A094736 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A094736() {
    super(0, "[0,1,-62,1651,-24816,233562,-1431634,5791471,-15717948,28663875,-28066500]", "[1,-63,1701,-25887,245427,-1510257,6084119,-15754053,24891552,-21416940,7484400]");
  }
}
