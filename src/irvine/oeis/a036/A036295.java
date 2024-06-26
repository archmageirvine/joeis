package irvine.oeis.a036;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A036295 Numerator of Sum_{i=1..n} i/2^i.
 * @author Sean A. Irvine
 */
public class A036295 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    return Q.TWO.subtract(new Q(++mN + 2, Z.ONE.shiftLeft(mN))).num();
  }
}

