package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.oeis.a054.A054143;

/**
 * A061929 Triangle with n &gt;= k &gt;= 0 where a(n,k) = 2^k*3^(n-k)*(C(n+1,0)+C(n+1,1)+...C(n+1,k)).
 * @author Sean A. Irvine
 */
public class A061929 extends A054143 {

  private int mN = -1;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return super.next().multiply(Z.THREE.pow(mN - mM)).shiftLeft(mM);
  }
}

