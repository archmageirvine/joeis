package irvine.oeis.a188;
// Generated by gen_seq4.pl decexp at 2021-07-27 22:38

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;
/**
 * A188638 Decimal expansion of length/width of a meta-1st electrum rectangle.
 * Formula: (1+sqrt(3)+sqrt(2*(10+sqrt(3))))/4
 * @author Georg Fischer
 */
public class A188638 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A188638() {
    super(1, CR.ONE.add(CR.THREE.sqrt()).add(CR.TWO.multiply(CR.TEN.add(CR.THREE.sqrt())).sqrt()).divide(CR.FOUR));
  }
}
