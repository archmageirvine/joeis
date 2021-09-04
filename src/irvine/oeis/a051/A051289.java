package irvine.oeis.a051;

import irvine.math.z.Z;

/**
 * A051289 Triangular array T read by rows: T(n,k)=P(2n+1,n,2k+1), where P(n,k,c)=number of vectors (x(1),x(2,),...,x(n)) of k 1's and n-k 0's such that x(i)=x(n+1-i) for exactly c values of i.
 * @author Sean A. Irvine
 */
public class A051289 extends A051287 {

  private int mN = -1;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return Z.valueOf(p(2 * mN + 1, mN, 2 * mM + 1));
  }
}
