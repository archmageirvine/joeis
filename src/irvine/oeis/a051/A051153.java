package irvine.oeis.a051;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A051153 (-1)-sigma super perfect numbers: (-1)sigma((-1)sigma(x))=2*x, where if x=Product p(i)^r(i) then (-1)sigma(x)=Product (-1+Sum p(i)^s(i), s(i)=1 to r(i)); (-1)sigma(1)=1.
 * @author Sean A. Irvine
 */
public class A051153 implements Sequence {

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
