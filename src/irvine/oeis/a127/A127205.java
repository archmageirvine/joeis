package irvine.oeis.a127;
// generated by patch_offset.pl at 2022-08-17 15:41

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A127205 Decimal expansion of 81*sqrt(3)/(8*Pi^3).
 * @author Georg Fischer
 */
public class A127205 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;

  /** Construct the sequence. */
  public A127205() {
    super(0, CR.valueOf(81).multiply(CR.THREE.sqrt()).divide(CR.EIGHT.multiply(REALS.pow(CR.PI, CR.THREE))));
  }
}
