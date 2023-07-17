package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A064546 Remainder when (n!)^2 is divided by n^n.
 * @author Sean A. Irvine
 */
public class A064546 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final Z mod = Z.valueOf(++mN).pow(mN);
    Z f = Z.ONE;
    for (long k = 1; k <= mN; ++k) {
      f = f.modMultiply(Z.valueOf(k * k), mod);
    }
    return f;
  }
}

