package irvine.oeis.a122;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a018.A018805;

/**
 * A122506 A symmetrical triangular array based on A018805 constructed by hand by adding ones between the primes and making the result symmetrical.
 * @author Sean A. Irvine
 */
public class A122506 extends Sequence1 {

  private final DirectSequence mA = DirectSequence.forceCreate(1, new A018805());
  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    if (mN == 0) {
      ++mN;
      return Z.ONE;
    }
    if (++mM > 4 * mN - 5) {
      ++mN;
      mM = 1;
    }
    if ((mM & 1) == 1) {
      return Z.ONE;
    }
    final long index = 2 * mM <= 4 * mN - 4 ? mM : 4 * mN - 4 - mM;
    return mA.a(index / 2 + 1);
  }
}
