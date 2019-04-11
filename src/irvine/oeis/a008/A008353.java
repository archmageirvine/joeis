package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008353 <code>2^n*(2^(n+1) - n - 1)</code>.
 * @author Sean A. Irvine
 */
public class A008353 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    return Z.ONE.shiftLeft(++mN + 1).subtract(mN + 1).shiftLeft(mN);
  }
}


