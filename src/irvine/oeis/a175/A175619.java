package irvine.oeis.a175;
// Generated by gen_seq4.pl decexp at 2021-07-16 22:36

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A175619 Decimal expansion of Product_{n&gt;=2} (1-n^(-8)).
 * Formula: (cosh(sqrt(2)*Pi)-cos(sqrt(2)*Pi))*sinh(Pi)/(16*Pi^3)
 * @author Georg Fischer
 */
public class A175619 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A175619() {
    super(0, CR.TWO.sqrt().multiply(CR.PI).cosh().subtract(CR.TWO.sqrt().multiply(CR.PI).cos()).multiply(CR.PI.sinh()).divide(CR.valueOf(16).multiply(CR.PI.pow(CR.THREE))));
  }
}
