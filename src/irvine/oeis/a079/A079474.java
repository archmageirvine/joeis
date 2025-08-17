package irvine.oeis.a079;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A079474 Triangular array: for s=0 to r-1, a(r,s) = p(s)^(r-s), where p(s) is the s-th primorial number. (p(0)=1, p(1)=2, p(2)=2*3, p(3)=2*3*5,...).
 * @author Sean A. Irvine
 */
public class A079474 extends Sequence0 {

  private int mN = 0;
  private int mM = -1;

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 0;
    }
    return Functions.PRIMORIAL_COUNT.z(mM).pow(mN - mM);
  }
}
