package irvine.oeis.a083;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence3;

/**
 * A083507 Triangle read by rows where the n-th row contains all distinct numbers that can be obtained as the product of three distinct numbers chosen from [1..n].
 * @author Sean A. Irvine
 */
public class A083507 extends Sequence3 {

  private final TreeSet<Long> mA = new TreeSet<>();
  private long mN = 2;

  @Override
  public Z next() {
    if (mA.isEmpty()) {
      ++mN;
      for (long k = 3; k <= mN; ++k) {
        for (long j = 2; j < k; ++j) {
          for (long i = 1; i < j; ++i) {
            mA.add(k * j * i);
          }
        }
      }
    }
    return Z.valueOf(mA.pollFirst());
  }
}
