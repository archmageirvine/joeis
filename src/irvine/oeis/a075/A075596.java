package irvine.oeis.a075;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A075596 a(1) = 2 and then the smallest prime that is obtained by placing digits on both sides of the previous term. Or smallest prime that encompasses a(n-1).
 * @author Sean A. Irvine
 */
public class A075596 extends Sequence1 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.TWO : A075595.findPrime(mA);
    return mA;
  }
}

