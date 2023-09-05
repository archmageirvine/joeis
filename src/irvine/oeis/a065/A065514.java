package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000040;
import irvine.oeis.a000.A000961;

/**
 * A065514 Largest prime power &lt; prime(n).
 * @author Sean A. Irvine
 */
public class A065514 extends A000040 {

  private final Sequence mPrimePowers = new A000961();
  private Z mPPP = null;
  private Z mPP = mPrimePowers.next();

  @Override
  public Z next() {
    final Z p = super.next();
    while (mPP.compareTo(p) < 0) {
      mPPP = mPP;
      mPP = mPrimePowers.next();
    }
    return mPPP;
  }
}
