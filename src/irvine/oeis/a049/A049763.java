package irvine.oeis.a049;

import irvine.math.z.Z;

/**
 * A049763 Triangular array T, read by rows: T(n,k) = n^4 mod k, for k = 1..n and n &gt;= 1.
 * @author Sean A. Irvine
 */
public class A049763 extends A049761 {

  @Override
  protected Z power() {
    return Z.FOUR;
  }
}
