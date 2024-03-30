package irvine.oeis.a069;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069000 Numbers k such that k * (digit complement of k) is a square.
 * @author Sean A. Irvine
 */
public class A069000 extends Sequence1 {

  // Giovanni Resta must have a better method, probably based on possible residues of squares mod 10^m

  private long mN = -1;

  private boolean is(final long n) {
    long m = 1;
    long t = n;
    long c = 0;
    while (t != 0) {
      c += m * (9 - t % 10);
      m *= 10;
      t /= 10;
    }
    return Z.valueOf(n).multiply(c).isSquare();
  }

  @Override
  public Z next() {
    while (true) {
      if (is(++mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
