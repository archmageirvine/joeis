package irvine.oeis.a349;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A349958 a(n) is the index of the first row in Pascal's triangle that contains a multiple of n.
 * @author Sean A. Irvine
 */
public class A349958 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ZERO;
    }
    long r = 1;
    long c = 0;
    while (true) {
      if (2 * ++c > r) {
        ++r;
        c = 1;
      }
      final Z t = Binomial.binomial(r, c);
      if (t.mod(mN) == 0) {
        return Z.valueOf(r);
      }
    }
  }
}
