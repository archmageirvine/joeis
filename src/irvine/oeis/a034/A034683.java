package irvine.oeis.a034;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A034683 Unitary abundant numbers: numbers k such that usigma(k) &gt; 2*k.
 * @author Sean A. Irvine
 */
public class A034683 implements Sequence {

  private Z mN = Z.valueOf(29);

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (Cheetah.factor(mN).unitarySigma().compareTo(mN.multiply2()) > 0) {
        return mN;
      }
    }
  }
}
