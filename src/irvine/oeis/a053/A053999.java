package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A053999 Prime number spiral (clockwise, Northwest spoke).
 * @author Sean A. Irvine
 */
public class A053999 extends A000040 {

  {
    setOffset(0);
  }

  private long mN = -1;
  private long mM = 0;

  @Override
  public Z next() {
    ++mN;
    final long t = 4 * mN * mN + 4 * mN + 1;
    Z p;
    do {
      ++mM;
      p = super.next();
    } while (mM < t);
    return p;
  }
}

