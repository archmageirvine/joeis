package irvine.oeis.a069;

import irvine.math.z.Z;
import irvine.oeis.a008.A008277;

/**
 * A069138 Triangle formed by multiplying Stirling numbers of 2nd kind S2(n,m) (A008277) by m+1.
 * @author Sean A. Irvine
 */
public class A069138 extends A008277 {

  @Override
  public Z next() {
    return super.next().multiply(mM + 1);
  }
}

