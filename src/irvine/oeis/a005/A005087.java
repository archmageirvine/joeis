package irvine.oeis.a005;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005087.
 * @author Sean A. Irvine
 */
public class A005087 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    final Z t = Z.valueOf(++mN).makeOdd();
    return Z.ONE.equals(t) ? Z.ZERO : Z.valueOf(Cheetah.factor(t).omega());
  }
}

