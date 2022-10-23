package irvine.oeis.a046;

import irvine.math.IntegerUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A046143 Triangle of gcd( 2^p-1, 2^q-1 ) = 2^gcd(p,q) - 1.
 * @author Sean A. Irvine
 */
public class A046143 extends Sequence1 {

  private int mN = 0;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return Z.ONE.shiftLeft(IntegerUtils.gcd(mN, mM)).subtract(1);
  }
}
