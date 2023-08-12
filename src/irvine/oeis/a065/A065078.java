package irvine.oeis.a065;

import irvine.math.z.Z;

/**
 * A065078 Triangle read by rows: a(n,m) = T[n,m,m] where T[i,j,k] is the 3-dimensional pyramid defined by T[n,m,0]=1 and T[i,j,k]=0 if j&gt;i or k&gt;j and T[i,j,k]=T[i-1,j,k]+T[i,j-1,k]+T[i,j,k-1].
 * @author Sean A. Irvine
 */
public class A065078 extends A065058 {

  private int mN = -1;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return mB.get(mN, mM, mM);
  }
}

