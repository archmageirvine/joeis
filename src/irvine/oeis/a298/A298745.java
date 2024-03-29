package irvine.oeis.a298;
// Generated by gen_seq4.pl dex CR.HALF.multiply(CR.ONE.add(CR.FIVE.add(CR.FOUR.multiply(CR.THREE.sqrt())).sqrt())) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A298745 Decimal expansion of (1/2)*(1 + sqrt(5 + 4*sqrt(3))).
 * @author Georg Fischer
 */
public class A298745 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A298745() {
    super(CR.HALF.multiply(CR.ONE.add(CR.FIVE.add(CR.FOUR.multiply(CR.THREE.sqrt())).sqrt())));
  }
}
