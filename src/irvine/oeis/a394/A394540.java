package irvine.oeis.a394;

import java.util.LinkedList;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000058;

/**
 * A394540 Sequence where, for every step t starting from 2, k is appended if t is a multiple of s(k-1), where s is Sylvester's sequence (A000058). If multiple numbers trigger on the same step, they are appended in increasing order.
 * @author Sean A. Irvine
 */
public class A394540 extends Sequence1 {

  private final DirectSequence mSylvester = DirectSequence.create(new A000058());
  private final LinkedList<Long> mA = new LinkedList<>();
  private long mT = 0;

  @Override
  public Z next() {
    while (mA.isEmpty()) {
      ++mT;
      for (long k = 0; mSylvester.a(k).compareTo(mT) <= 0; ++k) {
        if (mT % mSylvester.a(k).longValue() == 0) {
          mA.add(k + 1);
        }
      }
    }
    return Z.valueOf(mA.pollFirst());
  }
}
