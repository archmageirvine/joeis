package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388703 Decimal expansion of exp(-Pi) * (1+3^(1/2))^3.
 * @author Sean A. Irvine
 */
public class A388703 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388703() {
    super(0, CR.PI.negate().exp().multiply(CR.ONE.add(CR.THREE.sqrt()).pow(3)));
  }
}
