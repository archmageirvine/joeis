package irvine.oeis.a070;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A070067 Values of z in positive integer solutions of x^2 + y^5 = z^3, listed in increasing order of z.
 * @author Sean A. Irvine
 */
public class A070067 extends Sequence1 {

  private long mZ = 6;
  private Z mZ3 = Z.SIX.pow(3);
  private long mY = 6;

  protected Z select(final long z, final long y, final Z x) {
    return Z.valueOf(z);
  }

  @Override
  public Z next() {
    while (true) {
      final Z y5 = Z.valueOf(++mY).pow(5);
      if (y5.compareTo(mZ3) >= 0) {
        mZ3 = Z.valueOf(++mZ).pow(3);
        mY = 1;
      } else if (Predicates.SQUARE.is(mZ3.subtract(y5))) {
        return select(mZ, mY, mZ3.subtract(y5).sqrt());
      }
    }
  }
}
