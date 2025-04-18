package irvine.oeis.a059;
// Generated by gen_seq4.pl engelex at 2020-11-22 22:05

import irvine.math.cr.CR;
import irvine.oeis.EngelExpansionSequence;


/**
 * A059179 Engel expansion of 3^(1/3) = 1.44225.
 * @author Georg Fischer
 */
public class A059179 extends EngelExpansionSequence {

  /** Construct the sequence. */
  public A059179() {
    super(CR.ONE_THIRD.multiply(CR.THREE.log()).exp());
  }
}
