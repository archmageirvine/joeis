package irvine.oeis.a281;
// manually convprod at 2023-02-24 17:45

import irvine.math.z.Z;
import irvine.oeis.a001.A001222;
import irvine.oeis.a023.A023894;
import irvine.oeis.transform.ConvolutionProduct;

/**
 * A281616 Expansion of Sum_{p prime, i&gt;=1} x^(p^i)/(1 - x^(p^i)) / Product_{p prime, j&gt;=1} (1 - x^(p^j)).
 * @author Georg Fischer
 */
public class A281616 extends ConvolutionProduct {

  private int mN = 0;

  /** Construct the sequence. */
  public A281616() {
    super(1, "1,1", new A001222().skip(1), new A023894());
  }

  @Override
  public Z next() {
    return (++mN <= 1) ? Z.ZERO : super.next();
  }
}
