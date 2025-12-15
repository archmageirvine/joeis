package irvine.oeis.a082;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a000.A000796;

/**
 * A082591 Starting position of the first occurrence of n in the decimal expansion of Pi such that a(n) &gt; a(n-1) for n &gt;= 1.
 * @author Sean A. Irvine
 */
public class A082591 extends Sequence0 {

  private final Sequence mPi = new A000796();
  private long mV = 0;
  private long mN = -1;
  private long mMod = 10;
  private long mM = -1;

  @Override
  public Z next() {
    if (++mN == mMod) {
      mMod *= 10;
      --mM; // We are keeping one more digit
    }
    while (true) {
      mV *= 10;
      mV += mPi.next().longValue();
      mV %= mMod;
      ++mM;
      if (mV == mN) {
        return Z.valueOf(mM);
      }
    }
  }
}
