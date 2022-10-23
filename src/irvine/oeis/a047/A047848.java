package irvine.oeis.a047;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A047848 Array T read by diagonals; n-th difference of (T(k,n),T(k,n-1),...,T(k,0)) is (k+2)^(n-1), for n=1,2,3,...; k=0,1,2,...
 * @author Sean A. Irvine
 */
public class A047848 extends Sequence0 {

  private int mN = -1;
  private int mM = 0;

  protected Z t(final int n, final int m) {
    return Z.valueOf(m + 3).pow(n).add(m + 1).divide(m + 2);
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return t(mN - mM, mM);
  }
}

