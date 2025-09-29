package irvine.oeis.a080;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A080735 a(1)=1, then a(n)=2*a(n-1) if a(n-1) is prime, a(n)=a(n-1)+1 otherwise.
 * @author Sean A. Irvine
 */
public class A080735 extends Sequence1 {

  private Z mA = Z.ZERO;

  @Override
  public Z next() {
    mA = mA.isProbablePrime() ? mA.multiply2() : mA.add(1);
    return mA;
  }
}
