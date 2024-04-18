package irvine.oeis.a053;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A053163 n+cototient(n) produces these powers of 2 in order of magnitude.
 * @author Sean A. Irvine
 */
public class A053163 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final long t = 2 * ++mN - Functions.PHI.l(mN);
      if ((t & (t - 1)) == 0) {
        return Z.valueOf(t);
      }
    }
  }
}
