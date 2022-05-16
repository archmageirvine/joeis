package irvine.oeis.a046;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A046100 Biquadratefree numbers.
 * @author Sean A. Irvine
 */
public class A046100 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Jaguar.factor(++mN).maxExponent() < 4) {
        return Z.valueOf(mN);
      }
    }
  }
}
