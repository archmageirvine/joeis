package irvine.oeis.a057;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.UnionSequence;
import irvine.oeis.a031.A031157;
import irvine.oeis.a045.A045955;
import irvine.oeis.a045.A045956;

/**
 * A057768 From Goldbach problem: number of decompositions of 2n-1 into sum of a prime lucky number(from A031157) and a twin even-lucky-number(from A045955, A045956).
 * @author Sean A. Irvine
 */
public class A057768 extends Sequence0 {

  private final MemorySequence mA = MemorySequence.cachedSequence(new A031157());
  private final Sequence mBSeq = new UnionSequence(new A045955(), new A045956());
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
