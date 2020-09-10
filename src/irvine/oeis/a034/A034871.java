package irvine.oeis.a034;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A034871 Odd-numbered rows of Pascal's triangle.
 * @author Sean A. Irvine
 */
public class A034871 implements Sequence {

  private long mN = -1;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      mN += 2;
      mM = 0;
    }
    return Binomial.binomial(mN, mM);
  }
}
