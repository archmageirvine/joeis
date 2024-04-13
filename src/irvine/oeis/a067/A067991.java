package irvine.oeis.a067;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000217;

/**
 * A067991 a(n) = k such that the k-th triangular number is A068808(n).
 * @author Sean A. Irvine
 */
public class A067991 extends Sequence1 {

  private final Sequence mT = new A000217();
  private long mRecord = 0;
  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final long s = Functions.DIGIT_SUM.l(mT.next());
      if (s > mRecord) {
        mRecord = s;
        return Z.valueOf(mN);
      }
    }
  }
}

