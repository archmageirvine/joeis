package irvine.oeis.a067;

import java.util.LinkedList;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067061 A permutation of the natural numbers.
 * @author Sean A. Irvine
 */
public class A067061 extends Sequence1 {

  private final LinkedList<Long> mA = new LinkedList<>();
  private long mNext = 1;

  @Override
  public Z next() {
    while (mA.size() < 6) { // Sufficient to ensure we always can move the front element
      mA.add(mNext++);
    }
    while (true) {
      final long a = mA.pollFirst();
      if (Math.abs(a - mA.peekFirst()) >= 3) {
        return Z.valueOf(a);
      }
      int k = 0;
      for (final long v : mA) {
        if (Math.abs(a - v) < 3) {
          ++k;
        }
      }
      mA.add(k + 1, a);
    }
  }
}
