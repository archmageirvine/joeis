package irvine.oeis.a117;
// manually convprod at 2023-02-24 17:45

import irvine.math.z.Z;
import irvine.oeis.SkipSequence;
import irvine.oeis.a010.A010815;
import irvine.oeis.a046.A046746;
import irvine.oeis.transform.ConvolutionProduct;

/**
 * A117586 Coefficients of q in series expansion of Zagier&apos;s identity.
 * @author Georg Fischer
 */
public class A117586 extends ConvolutionProduct {

  private int mN = -1;

  /** Construct the sequence. */
  public A117586() {
    super(0, "1,1", new A010815(), new SkipSequence(new A046746(), 1));
  }

  @Override
  public Z next() {
    return (++mN <= 0) ? Z.ZERO : super.next().negate();
  }
}
