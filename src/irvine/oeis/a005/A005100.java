package irvine.oeis.a005;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005100 Deficient numbers: numbers k such that sigma(k) &lt; 2k.
 * @author Sean A. Irvine
 */
public class A005100 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (Jaguar.factor(mN).sigma().compareTo(mN.multiply2()) < 0) {
        return mN;
      }
    }
  }
}

