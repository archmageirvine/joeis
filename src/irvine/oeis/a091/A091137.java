package irvine.oeis.a091;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.oeis.a027.A027760;

/**
 * A091137 Largest number m such that number of times m divides k! is almost k/n for large k, i.e., largest m with A090624(m)=n.
 * @author Georg Fischer
 */
public class A091137 extends Sequence0 {

  private Z mA = Z.ONE;
  private int mN = -1;
  private final A027760 mSeq = new A027760();

  @Override
  public Z next() {
    // a(n+1) = A027760(n+1)*a(n).
    if (++mN == 0) {
      return mA;
    }
    mA = mA.multiply(mSeq.next());
    return mA;
  }
}
