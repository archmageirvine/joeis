package irvine.oeis.a063;

import irvine.math.function.Functions;
import irvine.math.z.Z;

/**
 * A063716 Number of solutions (r,u,s,t), s&gt;=t, in positive integers to the system of equations 1/r+1/u=1/n, 1/s+1/t=1/u.
 * @author Sean A. Irvine
 */
public class A063716 extends A063715 {

  @Override
  public Z next() {
    return super.next().add(Functions.SIGMA0.z((long) mN * mN)).divide2();
  }
}

