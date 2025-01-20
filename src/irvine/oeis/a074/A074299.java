package irvine.oeis.a074;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000002;

/**
 * A074299 Lengths of subsequences such that the first 'average' value (a[n]*1.5) is not achieved from the starting position in the Kolakoski sequence (A000002).
 * @author Sean A. Irvine
 */
public class A074299 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Sequence kolakoski1 = new A000002();
      long t = 0;
      for (long k = 0; k < 2 * mN; ++k) {
        t += kolakoski1.next().longValue();
      }
      if (t != 3 * mN) {
        return Z.valueOf(2 * mN);
      }
    }
  }
}
