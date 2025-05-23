package irvine.oeis.a059;
// Generated by gen_seq4.pl engelex at 2020-11-22 22:05

import irvine.math.cr.CR;
import irvine.oeis.EngelExpansionSequence;


/**
 * A059190 Engel expansion of gamma^2, (gamma is the Euler-Mascheroni constant A001620) = 0.333178.
 * @author Georg Fischer
 */
public class A059190 extends EngelExpansionSequence {

  /** Construct the sequence. */
  public A059190() {
    super(CR.GAMMA.multiply(CR.GAMMA));
  }
}
