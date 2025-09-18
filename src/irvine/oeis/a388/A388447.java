package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388447 Decimal expansion of 2 * exp(-Pi / 2) * (1+3^(1/2)).
 * @author Sean A. Irvine
 */
public class A388447 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388447() {
    super(1, CR.HALF_PI.negate().exp().multiply(2).multiply(CR.ONE.add(CR.THREE.sqrt())));
  }
}
