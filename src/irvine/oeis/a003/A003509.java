package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.a155.A155934;

/**
 * A003509.
 * @author Sean A. Irvine
 */
public class A003509 extends A155934 {

  private Z mA = Z.ONE;
  private long mN = 1;

  @Override
  public Z next() {
    Z t;
    do {
      ++mN;
      t = super.next();
    } while  (t.compareTo(mA) <= 0);
    mA = t;
    return Z.valueOf(mN);
  }
}

