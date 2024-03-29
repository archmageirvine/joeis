package irvine.oeis.a266;
// Generated by gen_seq4.pl decexp at 2021-07-16 22:36

import irvine.math.cr.CR;
import irvine.math.cr.Zeta;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A266264 Decimal expansion of zeta'(-14) (the derivative of Riemann's zeta function at -14).
 * Formula: 42567525/16/Pi^14*zeta(15)
 * @author Georg Fischer
 */
public class A266264 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A266264() {
    super(0, CR.valueOf(42567525).divide(CR.valueOf(16)).divide(CR.PI.pow(CR.valueOf(14))).multiply(Zeta.zeta(15)));
  }
}
