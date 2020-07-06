package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A033299 Smallest safe prime <code>((p-1)/2</code> is also prime) <code>&gt; n</code>.
 * @author Sean A. Irvine
 */
public class A033299 extends A000040 {

  private Z mN = Z.ZERO;
  private Z mP = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    if (mP.compareTo(mN) <= 0) {
      do {
        mP = super.next();
      } while (!mP.divide2().isProbablePrime());
    }
    return mP;
  }
}

