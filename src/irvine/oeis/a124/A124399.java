package irvine.oeis.a124;

import irvine.math.z.Z;
import irvine.oeis.a056.A056982;

/**
 * A124399 a(n) = 4^(n - bitcount(n)) where bitcount(n) = A000120(n).
 * @author Georg Fischer
 */
public class A124399 extends A056982 {

  private int mN = -1;
  private Z mA;

  @Override
  public Z next() {
    ++mN;
    if ((mN & 1) == 0) {
      mA = super.next();
    }
    return mA;
  }
}
