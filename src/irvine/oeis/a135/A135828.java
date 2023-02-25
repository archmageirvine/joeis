package irvine.oeis.a135;
// manually convprod at 2023-02-24 17:45

import irvine.oeis.SkipSequence;
import irvine.oeis.a007.A007331;
import irvine.oeis.a045.A045823;
import irvine.oeis.transform.ConvolutionProduct;

/**
 * A135828 Expansion of psi(x^2)^8 * (psi(x)^8 + psi(-x)^8) / 2 in powers of x^2 where psi() is a Ramanujan theta function.
 * @author Georg Fischer
 */
public class A135828 extends ConvolutionProduct {

  /** Construct the sequence. */
  public A135828() {
    super(0, "1,1", new SkipSequence(new A007331(), 1), new A045823());
  }
}
