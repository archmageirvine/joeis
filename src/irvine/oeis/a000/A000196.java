package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence0;

/**
 * A000196 Integer part of square root of n. Or, number of positive squares &lt;= n. Or, n appears 2n+1 times.
 * @author Sean A. Irvine
 */
public class A000196 extends Sequence0 implements DirectSequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.sqrt();
  }

  @Override
  public Z a(final Z n) {
    return n.sqrt();
  }

  @Override
  public Z a(final int n) {
    return Z.valueOf((int) Math.sqrt(n));
  }

}

