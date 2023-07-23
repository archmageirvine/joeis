package irvine.oeis.a064;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A064690 Define a sequence of fractions by x(m+1) = (x(m)^2+x(m)-1)/(x(m)+1) with x(1)=1; sequences gives values of n such that sgn(x(n))&lt;&gt;sgn(x(n-1)).
 * @author Sean A. Irvine
 */
public class A064690 extends Sequence1 {

  private long mN = 0;
  private CR mX = CR.ONE;

//  private Z mP = Z.ONE;
//  private Z mQ = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      ++mN;
//      Z p = mP;
//      Z q = mQ;
//      mP = p.square().add(p.multiply(q)).subtract(q.square());
//      mQ = q.multiply(p.add(q));
//      if ((p.signum() * q.signum()) != (mP.signum() * mQ.signum())) {
//        return Z.valueOf(mN);
//      }

      final CR y = mX;
      mX = mX.square().add(mX).subtract(CR.ONE).divide(mX.add(CR.ONE));
      if (y.signum() != mX.signum()) {
        return Z.valueOf(mN);
      }
    }
  }
}
