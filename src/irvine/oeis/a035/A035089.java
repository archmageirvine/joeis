package irvine.oeis.a035;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A035089.
 * @author Sean A. Irvine
 */
public class A035089 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z k = Z.ZERO;
    while (true) {
      k = k.add(1);
      final Z t = k.shiftLeft(mN).add(1);
      if (t.isProbablePrime()) {
        return t;
      }
    }
  }
}
