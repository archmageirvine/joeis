package irvine.oeis.a039;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A039655.
 * @author Sean A. Irvine
 */
public class A039655 implements Sequence {

  private long mN = 1;

  @Override
  public Z next() {
    long c = 0;
    Z m = Z.valueOf(++mN);
    while (!m.isProbablePrime()) {
      m = Cheetah.factor(m).sigma().subtract(1);
      ++c;
    }
    return Z.valueOf(c);
  }
}
