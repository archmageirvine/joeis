package irvine.oeis.a114;

import irvine.math.z.Z;
import irvine.oeis.a108.A108045;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A114525 Triangle of coefficients of the Lucas (w-)polynomials.
 * @author Georg Fischer
 */
public class A114525 extends SimpleTransformSequence {

  private int mN = -1;

  /** Construct the sequence. */
  public A114525() {
    super(new A108045(), Z::abs);
  }

  @Override
  public Z next() {
    ++mN;
    final Z result = super.next();
    return mN == 0 ? Z.TWO : result;
  }
}
