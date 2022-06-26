package irvine.oeis.a057;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000959;
import irvine.oeis.a045.A045954;

/**
 * A057747 Number of decompositions of 2n-1 into sum of a lucky number and an even-lucky-number (from A045954).
 * @author Sean A. Irvine
 */
public class A057747 implements Sequence {

  private final MemorySequence mA = MemorySequence.cachedSequence(new A000959());
  private final Sequence mBSeq = new A045954();
  private final TreeSet<Z> mB = new TreeSet<>();
  {
    mB.add(mBSeq.next()); // avoid isEmpty check later
  }
  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(2);
    long cnt = 0;
    int k = -1;
    while (mA.a(++k).compareTo(mN) < 0) {
      final Z t = mN.subtract(mA.a(k));
      while (t.compareTo(mB.last()) > 0) {
        mB.add(mBSeq.next());
      }
      if (mB.contains(t)) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
