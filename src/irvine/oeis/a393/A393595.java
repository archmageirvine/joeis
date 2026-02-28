package irvine.oeis.a393;

import java.util.TreeSet;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A393595 Sequence where k is appended after every k^k occurrences of 1, with multiple values following a 1 listed in order.
 * @author Sean A. Irvine
 */
public class A393595 extends Sequence1 {

  private final TreeSet<Long> mA = new TreeSet<>();
  private long mOnes = 0;

  @Override
  public Z next() {
    if (mA.isEmpty()) {
      ++mOnes;
      for (long k = 2, kk; (kk = LongUtils.pow(k, k)) <= mOnes; ++k) {
        if (mOnes % kk == 0) {
          mA.add(k);
        }
      }
      return Z.ONE;
    }
    return Z.valueOf(mA.pollFirst());
  }
}
