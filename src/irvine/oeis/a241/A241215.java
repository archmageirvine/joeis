package irvine.oeis.a241;
// Generated by gen_seq4.pl 2023-11-24/decexp at 2023-11-24 23:32

import irvine.math.cr.CR;
import irvine.math.cr.Zeta;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A241215 Decimal expansion of Sum_{n&gt;=1} H(n)^4/(n+1)^3 where H(n) is the n-th harmonic number.
 * Formula: Decimal expansion of sum_(n>=1) H(n)^4/(n+1)^3 where H(n) is the n-th harmonic number.  nonn,cons       1..100  nyi     _Jean-Fran?ois Alcove
 * @author Georg Fischer
 */
public class A241215 extends DecimalExpansionSequence {

  /** Construct the sequence */
  public A241215() {
    super(1, CR.valueOf(37).divide(CR.TWO).multiply(Zeta.zeta(3)).multiply(Zeta.zeta(4)).subtract(CR.FIVE.multiply(Zeta.zeta(2)).multiply(Zeta.zeta(5))).subtract(CR.valueOf(109).divide(CR.EIGHT).multiply(Zeta.zeta(7))));
  }
}
