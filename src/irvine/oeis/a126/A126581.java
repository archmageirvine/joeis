package irvine.oeis.a126;
// manually deris/essent at 2022-10-26 11:22

import irvine.math.z.Z;
import irvine.oeis.a003.A003038;

/**
 * A126581 Freeman Dyson's list of values of k for which there is an identity of a certain type for the k-th power of the Dedekind eta function.
 * @author Georg Fischer
 */
public class A126581 extends A003038 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    if (mN == 8) {
      return Z.valueOf(26);
    } else {
      return super.next();
    }
  }
}
