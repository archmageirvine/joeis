package irvine.oeis.a133;
// Generated by gen_seq4.pl 2025-05-27.ack/polya at 2025-05-27 23:49

import irvine.oeis.PolynomialFieldSequence;
import irvine.oeis.a004.A004016;
import irvine.oeis.a121.A121373;

/**
 * A133079 Expansion of f(x)^3 - 3 * x * f(x^9)^3 in powers of x^3 where f() is a Ramanujan theta function.
 * new A121373(), new A004016()
 * @author Georg Fischer
 */
public class A133079 extends PolynomialFieldSequence {

  /** Construct the sequence. */
  public A133079() {
    super(0, "[1],[0,-1]", "x,S,p1,T,*", 0, 0, 1, 1, new A121373(), new A004016());
  }
}
