package irvine.oeis.a064;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A064079 Zsigmondy numbers for a = 3, b = 1: Zs(n, 3, 1) is the greatest divisor of 3^n - 1^n (A024023) that is relatively prime to 3^m - 1^m for all positive integers m &lt; n.
 * @author Sean A. Irvine
 */
public class A064079 extends Sequence1 {

  private final long mM;
  private Z mT = Z.ONE;

  protected A064079(final long m) {
    mM = m;
  }

  /** Construct the sequence. */
  public A064079() {
    this(3);
  }

  private boolean is(final Z d, final Z t) {
    Z u = Z.valueOf(mM);
    while (u.compareTo(t) < 0) {
      if (!u.subtract(1).gcd(d).equals(Z.ONE)) {
        return false;
      }
      u = u.multiply(mM);
    }
    return true;
  }

  @Override
  public Z next() {
    mT = mT.multiply(mM);
    final Z[] d = Jaguar.factor(mT.subtract(1)).divisorsSorted();
    for (int k = d.length - 1; true; --k) {
      if (is(d[k], mT)) {
        return d[k];
      }
    }
  }
}
