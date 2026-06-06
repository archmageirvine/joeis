package irvine.oeis.a085;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a081.A081291;

/**
 * A085193 Repeating part of A085192.
 * @author Sean A. Irvine
 */
public class A085193 extends Sequence0 {

  private final Sequence mA = new A081291().skip();
  private final Sequence mB = new A085192();
  private long mM = 0;

  @Override
  public Z next() {
    final long n = mA.next().longValueExact() - 1;
    while (mM < n) {
      mB.next();
      ++mM;
    }
    ++mM;
    return mB.next();
  }
}
