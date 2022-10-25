package irvine.oeis.a006;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A006241 Number of minimal plane trees with n terminal nodes.
 * @author Sean A. Irvine
 */
public class A006241 extends MemorySequence {

  // The formula a(p^3)=3+3^p in (4.4) should be a(p^2)=2+2^p.

  {
    setOffset(1);
    add(null); // 0th term
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    switch (n) {
      case 1:
      case 2:
      case 3:
      case 5:
      case 7:
        return Z.ONE;
      case 4:
        return Z.TWO;
      case 6:
        return Z.THREE;
      default:
        Z sum = Z.ZERO;
        for (final Z dd : Jaguar.factor(n).divisors()) {
          final int d = dd.intValue();
          if (d != 1) {
            sum = sum.add(a(n / d).pow(d));
          }
        }
        return sum;
    }
  }
}

