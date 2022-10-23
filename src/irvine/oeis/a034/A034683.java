package irvine.oeis.a034;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A034683 Unitary abundant numbers: numbers k such that usigma(k) &gt; 2*k.
 * @author Sean A. Irvine
 */
public class A034683 extends Sequence1 {

  private Z mN = Z.valueOf(29);

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (Jaguar.factor(mN).unitarySigma().compareTo(mN.multiply2()) > 0) {
        return mN;
      }
    }
  }
}
