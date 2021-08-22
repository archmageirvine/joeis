package irvine.oeis.a050;

import irvine.math.z.Z;
import irvine.oeis.a002.A002322;

/**
 * A050992 4-Kn\u00f6del numbers.
 * @author Sean A. Irvine
 */
public class A050992 extends A002322 {

  {
    super.next();
    super.next();
    super.next();
    super.next();
  }
  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (mN.mod(super.next()).isZero()) {
        return mN.add(4);
      }
    }
  }
}
