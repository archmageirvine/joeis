package irvine.oeis.a390;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A390914 allocated for Marco Rip\u00e0.
 * @author Sean A. Irvine
 */
public class A390914 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(++mN).pow(mN - 1).add(1).pow(mN);
  }
}
