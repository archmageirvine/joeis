package irvine.oeis.a000;

import irvine.math.z.Binomial;
import irvine.math.z.Z;

import java.util.ArrayList;

/**
 * A000834 Expansion of exp(x)*(1 + tan(x))/(1 - tan(x)).
 * @author Sean A. Irvine
 */
public class A000834 extends A000831 {

  private final ArrayList<Z> mA = new ArrayList<>();

  @Override
  public Z next() {
    mA.add(super.next());
    Z s = Z.ZERO;
    for (int k = 0; k <= mN; ++k) {
      s = s.add(Binomial.binomial(mN, mN - k).multiply(mA.get(k)));
    }
    return s;
  }
}

