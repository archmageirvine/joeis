package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A001218 a(n) = 3^n mod 100.
 * @author Sean A. Irvine
 */
public class A001218 extends Sequence0 {

  private int mN = 0xAAAAAAAB;

  @Override
  public Z next() {
    mN *= 3;
    mN %= 100;
    return Z.valueOf(mN);
  }
}
