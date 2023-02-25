package irvine.oeis.a281;
// manually convprod at 2023-02-24 17:45

import irvine.math.z.Z;
import irvine.oeis.SkipSequence;
import irvine.oeis.a005.A005087;
import irvine.oeis.a099.A099773;
import irvine.oeis.transform.ConvolutionProduct;

/**
 * A281544 Expansion of Sum_{k&gt;=2} x^prime(k)/(1 - x^prime(k)) / Product_{k&gt;=2} (1 - x^prime(k)).
 * @author Georg Fischer
 */
public class A281544 extends ConvolutionProduct {

  private int mN = 0;

  /** Construct the sequence. */
  public A281544() {
    super(1, "1,1", new SkipSequence(new A005087(), 2), new A099773());
  }

  @Override
  public Z next() {
    return (++mN <= 2) ? Z.ZERO : super.next();
  }
}
