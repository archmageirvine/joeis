package irvine.oeis.a069;

import irvine.math.Mobius;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069044.
 * @author Sean A. Irvine
 */
public class A069056 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z t = Integers.SINGLETON.sumdiv(++mN, d -> Z.valueOf(d).square().multiply(Mobius.mobius(d)));
      if (Z.valueOf(mN).square().mod(t).isZero()) {
        return Z.valueOf(mN);
      }
    }
  }
}

