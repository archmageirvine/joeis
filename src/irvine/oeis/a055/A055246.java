package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.oeis.a005.A005836;

/**
 * A055246 At step number k &gt;= 1 the 2^(k-1) open intervals that are erased from [0,1] in the Cantor middle-third set construction are I(k,n) = (a(n)/3^k, (1+a(n))/3^k), n=1..2^(k-1).
 * @author Georg Fischer
 */
public class A055246 extends A005836 {

  @Override
  public Z next() {
    return super.next().multiply(6).add(1);
  }
}
