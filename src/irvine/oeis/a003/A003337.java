package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003337 Numbers n which are the sum of 3 nonzero 4th powers.
 * @author Sean A. Irvine
 */
public class A003337 implements Sequence {

  private Z mN = Z.TWO;

  protected int power() {
    return 4;
  }

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      for (Z t = mN.root(power()); t.compareTo(Z.ONE) >= 0; t = t.subtract(1)) {
        final Z k = mN.subtract(t.pow(power()));
        if (k.compareTo(Z.TWO) >= 0) {
          for (Z u = k.root(power()); u.compareTo(t) >= 0; u = u.subtract(1)) {
            final Z j = k.subtract(u.pow(power()));
            if (j.signum() > 0) {
              j.root(power());
              if (j.auxiliary() == 1) {
                return mN;
              }
            }
          }
        }
      }
    }
  }
}
