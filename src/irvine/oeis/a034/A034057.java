package irvine.oeis.a034;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A034057 Decimal part of <code>a(n)^(1/2)</code> starts with <code>n</code> (powers excluded).
 * @author Sean A. Irvine
 */
public class A034057 implements Sequence {

  private long mN = -1;
  private long mT = 10;

  @Override
  public Z next() {
    if (++mN == mT) {
      mT *= 10L;
    }
    Z m = Z.ONE;
    while (true) {
      m = m.add(1);
      if (!m.isSquare()) {
        if (CR.valueOf(m).sqrt().frac().multiply(mT).floor().longValueExact() == mN) {
          return m;
        }
      }
    }
  }
}

