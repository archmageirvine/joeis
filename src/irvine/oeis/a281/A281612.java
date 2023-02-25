package irvine.oeis.a281;
// manually convprod at 2023-02-24 17:45

import irvine.math.z.Z;
import irvine.oeis.SkipSequence;
import irvine.oeis.a000.A000041;
import irvine.oeis.a086.A086971;
import irvine.oeis.transform.ConvolutionProduct;

/**
 * A281612 Expansion of Sum_{i = p*q, p prime, q prime} x^i/(1 - x^i) / Product_{j&gt;=1} (1 - x^j).
 * @author Georg Fischer
 */
public class A281612 extends ConvolutionProduct {

  private int mN = 0;

  /** Construct the sequence. */
  public A281612() {
    super(1, "1,1", new A000041(), new SkipSequence(new A086971(), 3));
  }

  @Override
  public Z next() {
    return (++mN <= 3) ? Z.ZERO : super.next();
  }
}
