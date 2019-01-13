package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003336.
 * @author Sean A. Irvine
 */
public class A003336 implements Sequence {

  private Z mN = Z.ONE;

  protected int power() {
    return 4;
  }

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      for (Z t = mN.root(power()); t.compareTo(Z.ONE) >= 0; t = t.subtract(1)) {
        final Z k = mN.subtract(t.pow(power()));
        if (k.signum() > 0) {
          k.root(power());
          if (k.auxiliary() == 1) {
            return mN;
          }
        }
      }
    }
  }
}
