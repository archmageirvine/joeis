package irvine.oeis.a063;

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A063715 Number of solutions (r,u,s,t) in positive integers to the system of equations 1/r + 1/u = 1/n, 1/s + 1/t = 1/u.
 * @author Sean A. Irvine
 */
public class A063715 extends Sequence1 {

  protected int mN = 0;

  @Override
  public Z next() {
    return Integers.SINGLETON.sumdiv(++mN * mN, d -> Functions.SIGMA0.z(Z.valueOf(mN + d).square()));
  }
}

