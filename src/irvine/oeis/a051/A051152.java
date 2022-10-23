package irvine.oeis.a051;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A051152 (-1)sigma sociable number of order 2: (-1)sigma((-1)sigma(x))=x, but (-1)sigma(x)&lt;&gt;x, where if x=Product p(i)^r(i) then (-1)sigma(x)=Product (-1+Sum p(i)^s(i), s(i)=1 to r(i)); (-1)sigma(1)=1.
 * @author Sean A. Irvine
 */
public class A051152 extends Sequence0 {

  private Z mN = Z.THREE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z s = Jaguar.factor(mN).sigma(-1);
      if (!s.equals(mN) && Jaguar.factor(s).sigma(-1).equals(mN)) {
        return mN;
      }
    }
  }
}
