package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000796;

/**
 * A065570 Numbers k such that the first k ternary digits found in the decimal expansion of Pi form a prime.
 * @author Sean A. Irvine
 */
public class A065570 extends Sequence1 {

  private final long mBase;
  private final Sequence mPi = new A000796();
  private Z mA = Z.ZERO;
  private long mN = 0;

  protected A065570(final long base) {
    mBase = base;
  }

  /** Construct the sequence. */
  public A065570() {
    this(3);
  }

  @Override
  public Z next() {
    while (true) {
      final long t = mPi.next().longValue();
      if (t < mBase) {
        ++mN;
        mA = mA.multiply(mBase).add(t);
        if (mA.isProbablePrime()) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}
