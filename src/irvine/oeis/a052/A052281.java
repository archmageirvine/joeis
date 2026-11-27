package irvine.oeis.a052;

import irvine.oeis.Conjectural;
import irvine.oeis.gf.GfSequence;

/**
 * A052281 Number of equivalence classes of 4 X 4 nonnegative integer matrices with all row and column sums equal to n, under independent row and column permutations, whose lexicographically least representative is symmetric.
 * @author Sean A. Irvine
 */
public class A052281 extends GfSequence implements Conjectural {

  /** Construct the sequence. */
  public A052281() {
    super(0, "(1 + 2*x^2 + x^3 + 8*x^4 + 9*x^5 + 23*x^6 + 23*x^7 + 43*x^8 + 42*x^9 + 60*x^10 + 59*x^11 + 70*x^12 + 65*x^13 + 76*x^14 + 59*x^15 + 64*x^16 + 48*x^17 + 45*x^18 + 28*x^19 + 33*x^20 + 15*x^21 + 17*x^22 + 9*x^23 + 6*x^24 + 3*x^25 + x^26)/((1-x)*(1-x^3)^2*(1-x^4)^2*(1-x^6)*(1-x^9))");
  }
}
