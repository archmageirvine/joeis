package irvine.oeis.a034;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A034869 Right half of Pascal's triangle.
 * @author Sean A. Irvine
 */
public class A034869 implements Sequence {

  private long mN = -1;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = (mN + 1) / 2;
    }
    return Binomial.binomial(mN, mM);
  }
}
