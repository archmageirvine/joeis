package irvine.oeis.a077;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000040;
import irvine.oeis.a002.A002808;

/**
 * A077094.
 * @author Sean A. Irvine
 */
public class A077145 extends Sequence1 {

  private final Sequence mP = new A000040();
  private final Sequence mC = new A002808();
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z num = Z.ONE;
    Z den = Z.ONE;
    for (long k = 0; k < mN; ++k) {
      num = num.multiply(mP.next());
      den = den.multiply(mC.next());
    }
    return num.divide(den);
  }
}

