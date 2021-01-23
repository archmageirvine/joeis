package irvine.oeis.a034;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A034867 Triangle of odd-numbered terms in rows of Pascal's triangle.
 * @author Sean A. Irvine
 */
public class A034867 implements Sequence {

  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    mM += 2;
    if (mM > mN) {
      ++mN;
      mM = 1;
    }
    return Binomial.binomial(mN, mM);
  }
}
