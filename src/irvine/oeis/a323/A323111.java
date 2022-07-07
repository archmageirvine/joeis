package irvine.oeis.a323;
// manually A214258/trionk

import irvine.math.z.Z;
import irvine.oeis.a214.A214258;

/**
 * A323111 Number of compositions of 2n where the difference between largest and smallest parts equals n.
 * @author Georg Fischer
 */
public class A323111 extends A214258 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return mN == 0 ? Z.ZERO : super.compute(2 * mN, mN);
  }
}

