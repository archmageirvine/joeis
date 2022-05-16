package irvine.oeis.a046;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A046101 Biquadrateful numbers.
 * @author Sean A. Irvine
 */
public class A046101 implements Sequence {

  private long mN = 15;

  @Override
  public Z next() {
    while (true) {
      if (Jaguar.factor(++mN).maxExponent() >= 4) {
        return Z.valueOf(mN);
      }
    }
  }
}
