package irvine.oeis.a393;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a001.A001359;

/**
 * A393910 allocated for Jean-Marc Rebert.
 * @author Sean A. Irvine
 */
public class A393910 extends A001359 {

  private long mN = 0;
  private long mLen = 0;
  private Z mP = Z.ZERO;

  private long length(final Z k) {
    long len = 1;
    // k-1 is prime, k+1 is prime, no need to test that
    while (Functions.SIGMA0.l(k.subtract(len + 1)) == Functions.SIGMA0.l(k.add(len + 1))) {
      ++len;
    }
    return len;
  }

  @Override
  public Z next() {
    ++mN;
    while (mN > mLen) {
      mP = super.next();
      mLen = length(mP.add(1));
    }
    return mP;
  }
}
