package irvine.oeis.a034;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A034877 Rows of (Pascal's triangle - Losanitsch's triangle) (n &gt;= 0, k &gt;= 0).
 * @author Sean A. Irvine
 */
public class A034877 implements Sequence {

  private final A034851 mA = new A034851();
  private long mN = 1;
  private long mM = 1;

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 1;
    }
    return Binomial.binomial(mN, mM).subtract(mA.t(mN, mM));
  }
}
