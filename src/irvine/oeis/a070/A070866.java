package irvine.oeis.a070;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A070866 Smallest prime such that the difference of successive terms is nondecreasing.
 * @author Sean A. Irvine
 */
public class A070866 extends Sequence1 {

  private Z mP = Z.ONE;
  private Z mD = Z.ZERO;

  @Override
  public Z next() {
    final Z p = Functions.NEXT_PRIME.z(mP.add(mD));
    if (p.isOdd()) {
      mD = p.subtract(mP).subtract(1);
    }
    mP = p;
    return p;
  }
}
