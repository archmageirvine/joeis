package irvine.oeis.a064;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A064130 Number of divisors of 2^n + 1 that are relatively prime to 2^m + 1 for all 0 &lt; m &lt; n.
 * @author Sean A. Irvine
 */
public class A064130 extends Sequence0 {

  private final long mBase;
  private Z mT = null;

  protected A064130(final long base) {
    mBase = base;
  }

  /** Construct the sequence. */
  public A064130() {
    this(2);
  }

  private boolean is(final Z d, final Z t) {
    Z u = Z.valueOf(mBase);
    while (u.compareTo(t) < 0) {
      if (!u.subtract(1).gcd(d).equals(Z.ONE)) {
        return false;
      }
      u = u.multiply(mBase);
    }
    return true;
  }

  @Override
  public Z next() {
    mT = mT == null ? Z.ONE : mT.multiply(mBase);
    long cnt = 0;
    final Z[] div = Jaguar.factor(mT.add(1)).divisors();
    for (final Z d : div) {
      if (is(d, mT)) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
