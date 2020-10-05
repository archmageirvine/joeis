package irvine.oeis.a035;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A035319 Number of rooted maps of genus n with one vertex and one face; the maps are considered on orientable surfaces and contain 2n edges.
 * @author Sean A. Irvine
 */
public class A035319 implements Sequence {

  private long mN = -1;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 0) {
      mA = mA.multiply(4 * mN - 3).multiply(2 * mN - 1).multiply(4 * mN - 1).divide(2 * mN + 1);
    }
    return mA;
  }
}

