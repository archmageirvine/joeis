package irvine.oeis.a046;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A046902 Clark's triangle: left border = 0 1 1 1..., right border = multiples of 6; other entries = sum of 2 entries above.
 * @author Sean A. Irvine
 */
public class A046902 implements Sequence {

  private long mN = -1;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      if (++mN == 0) {
        return Z.ZERO;
      }
      mM = 0;
    }
    return Binomial.binomial(mN, mM - 1).multiply(6).add(Binomial.binomial(mN - 1, mM));
  }
}
