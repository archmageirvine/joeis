package irvine.oeis.a296;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A296374 a(0) = 3; a(n) = a(n-1)*(a(n-1)^2 - 3*a(n-1) + 4)/2.
 * @author Georg Fischer
 */
public class A296374 extends Sequence0 {

  private int mN;
  private Z mA;

  /** Construct the sequence. */
  public A296374() {
    mN = -1;
    mA = Z.THREE;
  }

  @Override
  public Z next() {
    ++mN;
    if (mN == 0) {
      return mA;
    }
    mA = mA.multiply(mA.square().subtract(mA.multiply(3)).add(4)).divide2();
    return mA;
  }
}
