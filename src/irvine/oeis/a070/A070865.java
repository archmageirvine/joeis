package irvine.oeis.a070;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A070865 Smallest prime such that the difference of successive terms is strictly increasing.
 * @author Sean A. Irvine
 */
public class A070865 extends Sequence1 {

  private Z mP = Z.ONE;
  private Z mD = Z.ZERO;

  @Override
  public Z next() {
    final Z p = Functions.NEXT_PRIME.z(mP.add(mD));
    if (p.isOdd()) {
      mD = p.subtract(mP);
    }
    mP = p;
    return p;
  }
}
