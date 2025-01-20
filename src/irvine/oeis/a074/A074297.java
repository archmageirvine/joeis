package irvine.oeis.a074;

import irvine.math.z.Z;
import irvine.oeis.Conjectural;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000002;

/**
 * A074297 Position of the first occurrence of n consecutive terms with the largest possible sum in the Kolakoski sequence (A000002).
 * @author Sean A. Irvine
 */
public class A074297 extends Sequence1 implements Conjectural {

  private static final long HEURISTIC = 100;
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    final Sequence kolakoski1 = new A000002();
    final Sequence kolakoski2 = new A000002();
    int best = 0;
    long bestPos = 0;
    int t = 0;
    for (long k = 0; k < mN; ++k) {
      t += kolakoski1.next().longValue();
    }
    long pos = 1;
    while (pos <= mN * HEURISTIC) {
      if (t > best) {
        best = t;
        bestPos = pos;
      }
      t -= kolakoski2.next().longValue();
      t += kolakoski1.next().longValue();
      ++pos;
    }
    return Z.valueOf(bestPos);
  }
}
