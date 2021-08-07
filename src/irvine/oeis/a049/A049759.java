package irvine.oeis.a049;

import irvine.math.z.Z;

/**
 * A049759 Triangular array T read by rows: T(n,k)=n^2 mod k, for k=1,2,...,n, n=1,2,...
 * @author Sean A. Irvine
 */
public class A049759 extends A049761 {

  @Override
  protected Z power() {
    return Z.TWO;
  }
}
