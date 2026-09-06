package irvine.oeis.a001;

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence0;

/**
 * A001710 Order of alternating group A_n, or number of even permutations of n letters.
 * @author Sean A. Irvine
 */
public class A001710 extends Sequence0 implements DirectSequence {

  private long mN = -1;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    if (++mN <= 2) {
      return Z.ONE;
    }
    mA = mA.multiply(mN);
    return mA;
  }


  @Override
  public Z a(final Z n) {
    return new Q(Functions.FACTORIAL.z(n), Z.TWO).num();
  }

  @Override
  public Z a(final long n) {
    return new Q(Functions.FACTORIAL.z(n), Z.TWO).num();
  }

}
