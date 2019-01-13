package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003338.
 * @author Sean A. Irvine
 */
public class A003338 implements Sequence {

  private Z mN = Z.THREE;

  protected int power() {
    return 4;
  }

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      for (Z t = mN.root(power()); t.compareTo(Z.ONE) >= 0; t = t.subtract(1)) {
        final Z k = mN.subtract(t.pow(power()));
        if (k.compareTo(Z.THREE) >= 0) {
          for (Z u = k.root(power()); u.compareTo(t) >= 0; u = u.subtract(1)) {
            final Z j = k.subtract(u.pow(power()));
            if (j.compareTo(Z.TWO) >= 0) {
              for (Z v = k.root(power()); v.compareTo(u) >= 0; v = v.subtract(1)) {
                final Z i = j.subtract(v.pow(power()));
                if (i.signum() > 0) {
                  i.root(power());
                  if (i.auxiliary() == 1) {
                    return mN;
                  }
                }
              }
            }
          }
        }
      }
    }
  }
}
