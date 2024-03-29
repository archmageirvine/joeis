package irvine.oeis.a238;
// Generated by gen_seq4.pl 2023-11-25/decexp at 2023-11-25 22:37

import irvine.math.cr.CR;
import irvine.math.cr.Zeta;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A238183 Decimal expansion of sum_(n&gt;=1) H(n)^2/n^7 where H(n) is the n-th harmonic number (Quadratic Euler Sum S(2,7)).
 * Formula: Decimal expansion of sum_(n>=1) H(n)^2/n^7 where H(n) is the n-th harmonic number (Quadratic Euler Sum S(2,7)). nonn,cons       1..100  nyi
 * @author Georg Fischer
 */
public class A238183 extends DecimalExpansionSequence {

  /** Construct the sequence */
  public A238183() {
    super(1, Zeta.zeta(3).pow(3).divide(CR.THREE).subtract(CR.FIVE.divide(CR.TWO).multiply(Zeta.zeta(4)).multiply(Zeta.zeta(5))).subtract(CR.SEVEN.divide(CR.TWO).multiply(Zeta.zeta(3)).multiply(Zeta.zeta(6))).subtract(Zeta.zeta(2).multiply(Zeta.zeta(7))).add(CR.valueOf(55).divide(CR.SIX).multiply(Zeta.zeta(9))));
  }
}
