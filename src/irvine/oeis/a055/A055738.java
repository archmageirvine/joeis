package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a090.A090258;

/**
 * A055738 Number of prime quadruples &lt; 10^n, where a prime quadruple means 4 successive primes {p, p', p'', p'''} with p''' = p + 8.
 * @author Sean A. Irvine
 */
public class A055738 extends Sequence1 {

  private final Sequence mQuad = new PrependSequence(new A090258(), 11); // (3,5,7,11) is a special case
  private long mLimit = 1;
  private long mCount = 0;
  private Z mA = mQuad.next();

  @Override
  public Z next() {
    mLimit *= 10;
    while (mA.longValueExact() <= mLimit) {
      ++mCount;
      mA = mQuad.next();
    }
    return Z.valueOf(mCount);
  }
}
