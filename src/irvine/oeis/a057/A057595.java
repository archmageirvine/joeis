package irvine.oeis.a057;

import irvine.math.z.Z;

/**
<<<<<<< Updated upstream
 * A057595 Triangle T(n,k) giving 2*p mod n-1, where p = period of sequence k^i (i=0,1,2,...) mod n (n &gt;= 2, 2&lt;=k&lt;=n).
 * @author Sean A. Irvine
 */
public class A057595 extends A057593 {
=======
 * A057593.
 * @author Sean A. Irvine
 */
public class A057594 extends A057593 {
>>>>>>> Stashed changes

  private long mN = 1;
  private long mM = 1;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 2;
    }
<<<<<<< Updated upstream
    return Z.valueOf((2 * t(mN, mM == mN ? 1 : mM)) % (mN - 1));
=======
    return Z.valueOf((2 * t(mN, mM == mN ? 1 : mM)) % (mN - 1) / 2);
>>>>>>> Stashed changes
  }
}
