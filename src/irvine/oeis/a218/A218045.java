package irvine.oeis.a218;
// manually convprom/convprod at 2023-07-10 13:48

import irvine.math.z.Z;
import irvine.oeis.a186.A186997;
import irvine.oeis.transform.ConvolutionProduct;

/**
 * A218045 Number of truth tables of bracketed formulas (case 3).
 * @author Georg Fischer
 */
public class A218045 extends ConvolutionProduct {

  private int mN = -1;

  /** Construct the sequence. */
  public A218045() {
    super(0, "1, 1", new A186997(), new A186997());
  }

  @Override
  public Z next() {
    if (++mN <= 1) {
      return Z.ZERO;
    }
    return super.next();
  }
}
