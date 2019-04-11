package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.a000.A000961;

/**
 * A010055 1 if n is a prime power p^k (k <code>&gt;= 0),</code> otherwise 0.
 * @author Sean A. Irvine
 */
public class A010055 extends A000961 {

  private Z mNext = super.next();
  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    if (mN.equals(mNext)) {
      mNext = super.next();
      return Z.ONE;
    }
    return Z.ZERO;
  }
}

