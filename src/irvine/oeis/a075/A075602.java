package irvine.oeis.a075;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A075602 a(1) = 17 and then the smallest prime that is obtained by placing digits on both sides of the previous term. Or smallest prime that encompasses a(n-1).
 * @author Sean A. Irvine
 */
public class A075602 extends Sequence1 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(17) : A075595.findPrime(mA);
    return mA;
  }
}

