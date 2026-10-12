package irvine.oeis.a051;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A051153 (-1)-sigma super perfect numbers: numbers k such that (-1)sigma((-1)sigma(k)) = 2*k, where if k = Product p(i)^r(i) then (-1)sigma(k) = Product (-1 + Sum_{s = 1..r(i)} p(i)^s); (-1)sigma(1) = 1.
 * @author Sean A. Irvine
 */
public class A051153 extends Sequence1 {

  private Z mN = Z.valueOf(246);

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z s = Jaguar.factor(mN).sigma(-1);
      if (Jaguar.factor(s).sigma(-1).equals(mN.multiply2())) {
        return mN;
      }
    }
  }
}
