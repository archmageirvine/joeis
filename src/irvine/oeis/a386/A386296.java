package irvine.oeis.a386;

import irvine.math.z.Z;
import irvine.oeis.a381.A381847;

/**
 * A386296 allocated for Janaka Rodrigo.
 * @author Sean A. Irvine
 */
public class A386296 extends A381847 {

  private int mN = 0;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 0;
    }
    return t(mM + 1, mN - mM);
  }
}

