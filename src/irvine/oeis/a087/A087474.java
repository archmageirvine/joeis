package irvine.oeis.a087;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;

/**
 * A087474 Triangle T(n,k), read by rows, in which the n-th row gives the n successive iterations of f(m) on A087473(n), where f(m) is product of the two numbers formed from the alternating digits of m.
 * @author Sean A. Irvine
 */
public class A087474 extends Sequence0 {

  private final Sequence mA = new A087473();
  private long mN = -1;
  private long mM = 0;
  private Z mT = null;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
      mT = mA.next();
      return mT;
    }
    mT = A087471.murphyProduct(mT);
    return mT;
  }
}
