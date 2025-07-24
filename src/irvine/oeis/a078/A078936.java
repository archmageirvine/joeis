package irvine.oeis.a078;

import irvine.math.function.Functions;
import irvine.math.z.Z;

/**
 * A078936 Smallest divisor of n*(n+1)/2 that is &gt;= sqrt(n*(n+1)/2).
 * @author Sean A. Irvine
 */
public class A078936 extends A078935 {

  @Override
  public Z next() {
    final Z t = super.next();
    return Functions.TRIANGULAR.z(mN).divide(t);
  }
}
