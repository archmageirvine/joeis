package irvine.oeis.a020;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A020730 Pisot sequences L(3,7) or S(3,7).
 * @author Sean A. Irvine
 */
public class A020730 extends Sequence0 {

  private final Z mInitA;
  private final Z mInitB;
  private Z mA = null;
  private Z mB = null;

  protected A020730(final long a, final long b) {
    mInitA = Z.valueOf(a);
    mInitB = Z.valueOf(b);
  }

  /** Construct the sequence. */
  public A020730() {
    this(3, 7);
  }

  @Override
  public Z next() {
    if (mB == null) {
      if (mA == null) {
        mA = mInitA;
        return mInitA;
      }
      mB = mInitB;
    } else {
      final Z t = mB.square().divide(mA).add(1);
      mA = mB;
      mB = t;
    }
    return mB;
  }
}

