package irvine.oeis.a047;

import irvine.math.z.Z;

/**
 * A047887 Triangle of numbers T(n,k) = number of permutations of n things with longest increasing subsequence of length &lt;=k (1&lt;=k&lt;=n).
 * @author Sean A. Irvine
 */
public class A047887 extends A047874 {

  private int mN = 0;
  private int mM = 0;
  private Z mSum = Z.ZERO;

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 0;
      mSum = Z.ZERO;
    }
    mSum = mSum.add(super.next());
    return mSum;
  }
}
