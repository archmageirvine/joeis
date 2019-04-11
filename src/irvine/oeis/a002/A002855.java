package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

import java.util.HashSet;
import java.util.ArrayList;

/**
 * A002855 {m <code>+ n</code>: m in A002382, n in A002381}.
 * @author Sean A. Irvine
 */
public class A002855 implements Sequence {

  private final HashSet<Z> mMembers = new HashSet<>();
  private final Sequence mA = new A002381();
  private final Sequence mB = new A002382();
  private final ArrayList<Z> mListA = new ArrayList<>();
  private final ArrayList<Z> mListB = new ArrayList<>();
  private Z mN = Z.NEG_ONE;
  {
    mListA.add(mA.next());
    mListB.add(mB.next());
    mMembers.add(Z.ZERO);
  }

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      while (mN.compareTo(mListA.get(mListA.size() - 1)) > 0) {
        final Z next = mA.next();
        mListA.add(next);
        for (final Z v : mListB) {
          mMembers.add(v.add(next));
        }
      }
      while (mN.compareTo(mListB.get(mListB.size() - 1)) > 0) {
        final Z next = mB.next();
        mListB.add(next);
        for (final Z v : mListA) {
          mMembers.add(v.add(next));
        }
      }
      if (mMembers.contains(mN)) {
        return mN;
      }
    }
  }
}
