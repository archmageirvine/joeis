package irvine.oeis.a062;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A062715 Triangle T(i,j) (i &gt;= -1, -1&lt;=j&lt;=i) whose (i,j)-th entry is 1 if j=-1 otherwise binomial(i,j)*2^(i-j).
 * @author Sean A. Irvine
 */
public class A062715 extends AbstractSequence {

  /** Construct the sequence. */
  public A062715() {
    super(-1);
  }

  private int mN = -2;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = -1;
      return Z.ONE;
    }
    return Binomial.binomial(mN, mM).shiftLeft(mN - mM);
  }
}
