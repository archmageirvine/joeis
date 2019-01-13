package irvine.oeis.a002;

import java.io.Serializable;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002129.
 * @author Sean A. Irvine
 */
public class A002129 implements Sequence, Serializable {

  private long mN = 0;

  @Override
  public Z next() {
    Z s = Z.ZERO;
    for (final Z d : Cheetah.factor(++mN).divisors()) {
      s = s.signedAdd(!d.isEven(), d);
    }
    return s;
  }
}
