package irvine.oeis.a082;

import irvine.math.z.Z;
import irvine.oeis.a000.A000108;

/**
 * A082853 Integers 0 to Catalan(n)-1 followed by integers 0 to Catalan(n+1)-1 etc.
 * @author Sean A. Irvine
 */
public class A082853 extends A000108 {

  private Z mC = super.next();
  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    if (mN.equals(mC)) {
      mC = super.next();
      mN = Z.ZERO;
    }
    return mN;
  }
}

