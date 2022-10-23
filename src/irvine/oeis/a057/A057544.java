package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A057544 Maximum cycle length (orbit size) in the rotation permutation of n+2 side polygon triangularizations.
 * @author Sean A. Irvine
 */
public class A057544 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    if (++mN <= 1) {
      return Z.ONE;
    } else if (mN == 2) {
      return Z.TWO;
    } else {
      return Z.valueOf(mN + 2);
    }
  }
}
