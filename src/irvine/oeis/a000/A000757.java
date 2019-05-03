package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000757 Number of cyclic permutations of <code>[n]</code> with no <code>i-&gt;i+1 (mod n)</code>.
 * @author Sean A. Irvine
 */
public class A000757 implements Sequence {

  private long mN = -1;
  private Z mA = Z.ZERO;
  private Z mB = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 0) {
      final Z t = mB.multiply(mN - 2).add(mA.multiply(mN - 1)).add((mN & 1) == 0 ? -1 : 1);
      mA = mB;
      mB = t;
    }
    return mB;
  }
}
