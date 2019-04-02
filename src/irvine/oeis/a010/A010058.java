package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.a000.A000108;

/**
 * A010058 1 if n is a Catalan number else 0.
 * @author Sean A. Irvine
 */
public class A010058 extends A000108 {

  {
    super.next();
  }
  private Z mNext = super.next();
  private Z mN = Z.NEG_ONE;

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

