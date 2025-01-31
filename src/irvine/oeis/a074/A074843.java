package irvine.oeis.a074;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A074843 Quadruplets: base 10 representation is the juxtaposition of four identical strings.
 * @author Sean A. Irvine
 */
public class A074843 extends Sequence1 {

  private long mN = 0;
  private long mM = 10;

  @Override
  public Z next() {
    if (++mN == mM) {
      mM *= 10;
    }
    return Z.valueOf(mN).multiply(mM).add(mN).multiply(mM).add(mN).multiply(mM).add(mN);
  }
}
