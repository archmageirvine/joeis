package irvine.oeis.a072;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072145.
 * @author Sean A. Irvine
 */
public class A072164 extends Sequence1 {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      final Z t = Z.valueOf(++mN).pow(mN).subtract(Z.valueOf(mN - 1).pow(mN - 1));
      if (t.isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
