package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.a004.A004979;

/**
 * A048224 a(n)=least number m such that m-a(n-1)&lt;&gt;a(j)-a(k) for all j,k less than m; a(1)=1, a(2)=4.
 * @author Sean A. Irvine
 */
public class A048224 extends A004979 {

  @Override
  protected Z a2() {
    return Z.FOUR;
  }
}
