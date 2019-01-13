package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001326.
 * @author Sean A. Irvine
 */
public class A001326 implements Sequence {

  private int mN = 1;

  @Override
  public Z next() {
    ++mN;
    return A001325.extendedSCrossDCycleIndex(2, mN).eval(mN).toZ();
  }
}
