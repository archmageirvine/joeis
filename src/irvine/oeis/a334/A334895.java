package irvine.oeis.a334;
// manually convprom/convoseq at 2023-07-10 13:48

import irvine.math.z.Z;
import irvine.oeis.ConvolutionSequence;
import irvine.oeis.a000.A000040;
import irvine.oeis.a010.A010815;

/**
 * A334895 G.f.: (Sum_{k&gt;=1} prime(k) * x^k) * (Product_{j&gt;=1} (1 - x^j)).
 * @author Georg Fischer
 */
public class A334895 extends ConvolutionSequence {

  private int mN = -1;

  /** Construct the sequence. */
  public A334895() {
    super(0, new A000040(), new A010815());
  }

  @Override
  public Z next() {
    if (++mN <= 0) {
      return Z.ZERO;
    }
    return super.next();
  }
}
