package irvine.oeis.a005;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A005100 Deficient numbers: numbers k such that sigma(k) &lt; 2k.
 * @author Sean A. Irvine
 */
public class A005100 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (Functions.SIGMA1.z(mN).compareTo(mN.multiply2()) < 0) {
        return mN;
      }
    }
  }
}

