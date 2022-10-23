package irvine.oeis.a212;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A212309 a(n) = n! mod 3^n.
 * @author Georg Fischer
 */
public class A212309 extends Sequence0 {

  private int mN = -1;
  private Z mFact = Z.ONE;

  @Override
  public Z next() {
    ++mN;
    if (mN > 0) {
      mFact = mFact.multiply(mN);
    }
    return mFact.mod(Z.THREE.pow(mN));
  }
}
