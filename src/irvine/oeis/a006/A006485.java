package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A006485 a(n) = (2^(2^n + 1) + 1)/3.
 * @author Sean A. Irvine
 */
public class A006485 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    if (++mN > 30) {
      throw new UnsupportedOperationException();
    }
    return Z.ONE.shiftLeft((1L << mN) + 1).add(1).divide(3);
  }
}

