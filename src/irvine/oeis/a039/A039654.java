package irvine.oeis.a039;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A039654.
 * @author Sean A. Irvine
 */
public class A039654 implements Sequence {

  private long mN = 1;

  @Override
  public Z next() {
    Z m = Z.valueOf(++mN);
    while (!m.isProbablePrime()) {
      m = Cheetah.factor(m).sigma().subtract(1);
    }
    return m;
  }
}
