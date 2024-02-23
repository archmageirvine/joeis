package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a004.A004539;

/**
 * A068541 Let sqrt(2) = 1.d(1)d(2)d(3)... = 1.0110101000001... be the expansion of sqrt(2) in base 2; sequence gives values of j such that j/2 = Sum_{k=1..j} d(k).
 * @author Sean A. Irvine
 */
public class A068541 extends Sequence1 {

  private final Sequence mSeq = new A004539().skip();
  private long mN = 0;
  private long mSum = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      mSum += mSeq.next().longValue();
      if (2 * mSum == mN) {
        return Z.valueOf(mN);
      }
    }
  }
}
