package irvine.oeis.a003;

import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A003130 Impedances of an n-terminal network.
 * @author Sean A. Irvine
 */
public class A003130 extends Sequence2 {

  private final A003128 mD = new A003128();
  {
    mD.next();
    mD.next();
  }
  private final A003129 mT = new A003129();
  private long mN = 1;

  private Z falling(final long x, final long n) {
    Z r = Z.valueOf(x);
    for (long k = 1; k < n; ++k) {
      r = r.multiply(x - k);
    }
    return r;
  }

  private Z u(final long x) {
    return falling(x, 4).multiply(20)
      .add(falling(x, 5).multiply(10))
      .add(falling(x, 6))
      .divide(8);
  }

  @Override
  public Z next() {
    ++mN;
    Z s = Z.ZERO;
    for (long k = 1; k <= mN; ++k) {
      s = s.add(u(k).multiply(Stirling.secondKind(mN, k)));
    }
    return s.add(mD.next()).add(mT.next().multiply2());
  }
}

