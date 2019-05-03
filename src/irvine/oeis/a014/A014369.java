package irvine.oeis.a014;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A014369 <code>a(n) =</code> bcd, where <code>n = C(b,3)+C(c,2)+C(d,1), b&gt;c&gt;d&gt;=0</code>.
 * @author Sean A. Irvine
 */
public class A014369 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    Z m = mN;
    long b = 3;
    while (Binomial.binomial(b + 1, 3).compareTo(m) <= 0) {
      ++b;
    }
    m = m.subtract(Binomial.binomial(b, 3));
    long c = 0;
    while (Binomial.binomial(c + 1, 2).compareTo(m) <= 0) {
      ++c;
    }
    m = m.subtract(Binomial.binomial(c, 2));
//    long d = 0;
//    while (Binomial.binomial(d + 1, 1).compareTo(m) <= 0) {
//      ++d;
//    }
    return new Z(b + String.valueOf(c) + m);
  }
}

