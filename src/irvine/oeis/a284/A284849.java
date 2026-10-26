package irvine.oeis.a284;

import irvine.oeis.Conjectural;
import irvine.oeis.gf.GfSequence;

/**
 * A284849 Number of zeros strictly inside the unit circle of the Bernoulli polynomial B(n,x).
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A284849 extends GfSequence implements Conjectural {

  /** Construct the sequence. */
  public A284849() {
    super(0, "x*(1 + 2*x + 2*x^2 + 3*x^3 + 2*x^4 + 2*x^5 + 2*x^6 + 2*x^7 + 2*x^8 + 2*x^9 + 2*x^10 + 2*x^11 - 2*x^15 - 2*x^17 - 2*x^18 - x^19 - 2*x^20) / ((1 - x)*(1 + x)*(1 + x^2))");
  }
}
