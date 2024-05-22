package irvine.oeis.a055;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A055388 Number of riffle shuffles of 2n cards required to return the deck to its initial state.
 * @author Sean A. Irvine
 */
public class A055388 extends Sequence1 {

  private int mN = -1;

  @Override
  public Z next() {
    mN += 2;
    return mN == 1 ? Z.TWO : Z.TWO.lcm(Functions.ORDER.z(mN, Z.TWO));
  }
}
