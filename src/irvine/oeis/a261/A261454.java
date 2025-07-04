package irvine.oeis.a261;
// Generated by gen_seq4.pl 2025-05-27.ack/polya at 2025-05-27 23:49

import irvine.oeis.PolynomialFieldSequence;
import irvine.oeis.a004.A004016;
import irvine.oeis.a121.A121373;

/**
 * A261454 Expansion of a(x^2) / f(-x) in powers of x where a() is a cubic AGM theta function and f() is a Ramanujan theta function.
 * new A004016(), new A121373()
 * @author Georg Fischer
 */
public class A261454 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A261454() {
    super(0, "[1],[0,0,1],[0,-1]", "p1,S,p2,T,/", 0, 0, 1, 1, new A004016(), new A121373());
  }
}
