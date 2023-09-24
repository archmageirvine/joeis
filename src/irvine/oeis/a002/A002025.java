package irvine.oeis.a002;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A002025 Smaller of an amicable pair: (a,b) such that sigma(a) = sigma(b) = a+b, a &lt; b.
 * @author Sean A. Irvine
 */
public class A002025 extends Sequence1 {

  private Z mN = Z.valueOf(119);

  private Z aliquot(final Z n) {
    if (n.isProbablePrime()) {
      return Z.ONE;
    }
    return Jaguar.factor(n).sigma().subtract(n);
  }

  protected Z select(final Z n, final Z a) {
    return n;
  }

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z a = aliquot(mN);
      if (a.compareTo(mN) > 0 && aliquot(a).equals(mN)) {
        return select(mN, a);
      }
    }
  }
}
