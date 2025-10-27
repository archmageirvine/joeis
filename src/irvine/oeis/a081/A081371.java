package irvine.oeis.a081;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A081371 Binomial coefficients C(n,j) reduced modulo j, j=1,...n; read by rows, j=0 is omitted because of mod(n,0).
 * @author Sean A. Irvine
 */
public class A081371 extends Sequence1 {

  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return Binomial.binomial(mN, mM).modZ(mM);
  }
}

