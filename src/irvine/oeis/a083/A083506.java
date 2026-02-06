package irvine.oeis.a083;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A083506 Triangle read by rows where the n-th row contains all distinct numbers that can be obtained as the product of two distinct numbers chosen from [1..n].
 * @author Sean A. Irvine
 */
public class A083506 extends Sequence2 {

  private final TreeSet<Long> mA = new TreeSet<>();
  private long mN = 1;

  @Override
  public Z next() {
    if (mA.isEmpty()) {
      ++mN;
      for (long k = 2; k <= mN; ++k) {
        for (long j = 1; j < k; ++j) {
          mA.add(k * j);
        }
      }
    }
    return Z.valueOf(mA.pollFirst());
  }
}
