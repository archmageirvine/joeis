package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001688 4th forward differences of factorial numbers <code>A000142</code>.
 * @author Sean A. Irvine
 */
public class A001688 implements Sequence {

  private long mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 1) {
      mF = mF.multiply(mN);
    }
    final Z m = Z.valueOf(mN).add(6).multiply(mN).add(17).multiply(mN).add(20).multiply(mN).add(9);
    return mF.multiply(m);
  }
}
