package irvine.oeis.a136;
// manually convprod at 2023-02-24 17:45

import irvine.oeis.SkipSequence;
import irvine.oeis.a007.A007332;
import irvine.oeis.a008.A008653;
import irvine.oeis.transform.ConvolutionProduct;

/**
 * A136747 Expansion of a(q)^2 * (b(q) * c(q) / 3)^3 in powers of q where a(), b(), c() are cubic AGM theta functions.
 * @author Georg Fischer
 */
public class A136747 extends ConvolutionProduct {

  /** Construct the sequence. */
  public A136747() {
    super(1, "1,1", new SkipSequence(new A007332(), 1), new A008653());
  }
}
