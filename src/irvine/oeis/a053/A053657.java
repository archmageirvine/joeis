package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.oeis.a001.A001898;

/**
 * A053657 a(n) = Product_{p prime} p^{ Sum_{k&gt;= 0} floor[(n-1)/((p-1)p^k)]}.
 * @author Sean A. Irvine
 */
public class A053657 extends A001898 {

  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (mN > 0) {
      mF = mF.multiply(mN + 1);
    }
    return super.next().multiply(mF);
  }
}
