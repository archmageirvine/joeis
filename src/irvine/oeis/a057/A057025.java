package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A057025 Smallest prime of form (2n+1)*2^m+1 for some m.
 * @author Sean A. Irvine
 */
public class A057025 extends Sequence0 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(2);
    Z t = mN;
    Z u;
    while (!(u = t.add(1)).isProbablePrime()) {
      t = t.multiply2();
    }
    return u;
  }
}
