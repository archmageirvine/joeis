package irvine.oeis.a080;

import irvine.math.z.Z;

/**
 * A080936 Triangle read by rows: T(n,k) is the number of Dyck paths of semilength n and height k (1 &lt;= k &lt;= n).
 * @author Sean A. Irvine
 */
public class A080936 extends A080934 {

  /** Construct the sequence. */
  public A080936() {
    super(1);
  }

  private int mN = 0;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 0;
    }
    return mB.get(2 * mN, 0, mM + 1).subtract(mB.get(2 * mN, 0, mM));
  }
}

