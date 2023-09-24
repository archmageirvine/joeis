package irvine.oeis.a134;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000040;

/**
 * A134323 a(n) = Legendre(-3, prime(n)).
 * @author Georg Fischer
 */
public class A134323 extends Sequence1 {

  private final A000040 mSeq = new A000040();
  private int mN = 0;

  {
    mSeq.skip(1);
  }

  @Override
  public Z next() {
    ++mN;
    return (mN <= 1) ? Z.valueOf(mN - 2) : Z.valueOf(LongUtils.jacobi(-3, mSeq.next().intValue()));
  }
}
