package irvine.oeis.a093;
// generated by patch_offset.pl at 2022-08-17 15:41

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A093822 Decimal expansion of -109/121 - 82/(121*sqrt(3)) + (2*sqrt(-35139 + 28634*sqrt(3)))/121 - Pi/3 + arccos((-1 + sqrt(3))/2).
 * @author Georg Fischer
 */
public class A093822 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;

  /** Construct the sequence. */
  public A093822() {
    super(0, CR.ZERO.subtract(CR.valueOf(109).divide(CR.valueOf(121))).subtract(CR.valueOf(82).divide(CR.valueOf(121).multiply(CR.THREE.sqrt()))).add(CR.TWO.multiply(CR.valueOf(35139).negate().add(CR.valueOf(28634).multiply(CR.THREE.sqrt())).sqrt()).divide(CR.valueOf(121))).subtract(CR.PI.divide(CR.THREE)).add(REALS.acos(CR.ONE.negate().add(CR.THREE.sqrt()).divide(CR.TWO))));
  }
}
