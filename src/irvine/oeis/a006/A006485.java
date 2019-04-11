package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006485 <code>a(n) = (2^(2^n + 1) + 1)/3</code>.
 * @author Sean A. Irvine
 */
public class A006485 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    if (++mN > 30) {
      throw new UnsupportedOperationException();
    }
    return Z.ONE.shiftLeft((1 << mN) + 1).add(1).divide(3);
  }
}

