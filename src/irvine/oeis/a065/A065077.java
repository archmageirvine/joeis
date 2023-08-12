package irvine.oeis.a065;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A065077 Triangle read by rows: T(n,m) = C[n,m,m] where C[i,j,k] is the 3-dimensional Catalan pyramid defined by C[0,0,0]=1 and C[i,j,k]=0 if j&gt;i or k&gt;j and C[i,j,k]=C[i-1,j,k]+C[i,j-1,k]+C[i,j,k-1].
 * @author Sean A. Irvine
 */
public class A065077 extends Sequence0 {

  private static final MemoryFactorial F = MemoryFactorial.SINGLETON;
  private int mN = -1;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return F.factorial(mN + 2 * mM)
      .multiply(mN - mM + 1)
      .multiply(mN - mM + 2)
      .divide(F.factorial(mM))
      .divide(F.factorial(mM + 1))
      .divide(F.factorial(mN + 2));
  }
}

