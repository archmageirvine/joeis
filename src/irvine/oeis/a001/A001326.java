package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001326 Number of equivalence classes of n-valued Post functions of 2 variables under action of semi-direct product of symmetric group S_2 and complementing group <code>D(2,n)</code>.
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
