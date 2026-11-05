package irvine.oeis.a004;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence0;

/**
 * A004525 One even followed by three odd.
 * @author Sean A. Irvine
 */
public class A004525 extends Sequence0 implements DirectSequence {

  private Z mN = Z.NEG_ONE;
  private int mCount = 0;

  @Override
  public Z next() {
    if (mCount == 0) {
      mN = mN.add(1);
      mCount = mN.isEven() ? 1 : 3;
    }
    --mCount;
    return mN;
  }

  @Override
  public Z a(final Z n) {
    return n.isZero() ? Z.ZERO : n.divide(4).add(Functions.QUOTIENT_CEILING.z(n, 4L)); // n.mod(4) == 0 ? n.divide(4) : n.divide(4).add(1)); // );
  }

  @Override
  public Z a(final long n) {
    return n == 0L ? Z.ZERO : Z.valueOf(n / 4 + Functions.QUOTIENT_CEILING.l(n, 4L)); // n/4 + (n % 4L == 0L ? n / 4 : n / 4 + 1)); // );
  }

}
