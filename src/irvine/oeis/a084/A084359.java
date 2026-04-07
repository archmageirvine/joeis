package irvine.oeis.a084;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A084359 a(n) = number of partitions of n into pair of parts n=p+q, p&gt;=q&gt;=1, with p-q equal to a square &gt;= 0.
 * @author Sean A. Irvine
 */
public class A084359 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ZERO;
    }
    return (mN & 1) == 0 ? Functions.SQRT.z((mN - 2) / 4).add(1) : Functions.SQRT.z(mN - 2).subtract(1).divide(2).add(1);
  }
}
