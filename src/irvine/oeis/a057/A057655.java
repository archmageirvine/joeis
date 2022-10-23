package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A057655 The circle problem: number of points (x,y) in square lattice with x^2 + y^2 &lt;= n.
 * @author Sean A. Irvine
 */
public class A057655 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    long sum = 0;
    long sign = 1;
    for (long k = 1; k <= mN; k += 2, sign *= -1) {
      sum += sign * (mN / k);
    }
    return Z.valueOf(sum).multiply(4).add(1);
  }
}
