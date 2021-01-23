package irvine.oeis.a034;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A034839 Triangular array formed by taking every other term of each row of Pascal's triangle.
 * @author Sean A. Irvine
 */
public class A034839 implements Sequence {

  private long mN = -1;
  private long mM = 0;

  @Override
  public Z next() {
    mM += 2;
    if (mM > mN) {
      ++mN;
      mM = 0;
    }
    return Binomial.binomial(mN, mM);
  }
}
