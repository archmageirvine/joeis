package irvine.oeis.a007;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007086 Next term is uniquely the sum of 3 earlier terms.
 * @author Sean A. Irvine
 */
public class A007086 implements Sequence {

  // Cf. A002858
  private final ArrayList<Z> mSeq = new ArrayList<>();
  private final TreeSet<Z> mSums = new TreeSet<>();
  private final HashSet<Z> mNotUnique = new HashSet<>();

  protected Z a1() {
    return Z.ONE;
  }

  protected Z a2() {
    return Z.TWO;
  }

  protected Z a3() {
    return Z.THREE;
  }

  @Override
  public Z next() {
    final int n = mSeq.size();
    if (n == 0) {
      final Z a1 = a1();
      mSeq.add(a1);
      return a1;
    } else if (n == 1) {
      final Z a2 = a2();
      mSeq.add(a2);
      mSums.add(a2.add(a1()));
      return a2;
    } else if (n == 2) {
      final Z a3 = a3();
      mSeq.add(a3);
      mSums.add(a3.add(a2()).add(a1()));
      return a3;
    }
    final Z prev = mSeq.get(n - 1);
    while (true) {
      final Z next = mSums.pollFirst();
      if (next.compareTo(prev) <= 0 || mNotUnique.contains(next)) {
        mNotUnique.remove(next);
        continue;
      }
      for (int k = 0; k < mSeq.size(); ++k) {
        final Z v = mSeq.get(k);
        for (int j = k + 1; j < mSeq.size(); ++j) {
          final Z u = mSeq.get(j);
          final Z s = v.add(u).add(next);
          if (!mSums.add(s)) {
            mNotUnique.add(s);
          }
        }
      }
      mSeq.add(next);
      return next;
    }
  }
}
