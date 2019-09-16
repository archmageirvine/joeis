package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008778 <code>a(n) = (n+1)*(n^2 +8*n +6)/6</code>. Number of n-dimensional partitions of 4. Number of terms in 4th derivative of a function composed with itself n times.
 * @author Sean A. Irvine
 */
public class A008778 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.add(8).multiply(mN).add(6).multiply(mN.add(1)).divide(6);
  }
}
