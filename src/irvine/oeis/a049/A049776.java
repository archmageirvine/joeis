package irvine.oeis.a049;

import irvine.math.z.Z;

/**
 * A049776 Triangular array T read by rows: n-th row consists of fixed points, k, of n-th row of array t given by A049773; i.e., t(n, t(n,k)) = t(n,k).
 * @author Sean A. Irvine
 */
public class A049776 extends A049773 {

  @Override
  public Z next() {
    while (true) {
      final Z v = super.next();
      if (v.equals(Z.valueOf(mN + 1))) {
        return v;
      }
    }
  }
}
