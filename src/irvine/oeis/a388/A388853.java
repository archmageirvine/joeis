package irvine.oeis.a388;

import java.util.ArrayList;
import java.util.LinkedList;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a038.A038566;
import irvine.oeis.a038.A038567;

/**
 * A388853 allocated for Clark Kimberling.
 * @author Sean A. Irvine
 */
public class A388853 extends Sequence1 {

  private final Sequence mNum;
  private final Sequence mDen;
  private long mT = 0;
  private final ArrayList<Q> mS = new ArrayList<>();
  private final ArrayList<LinkedList<Long>> mRows = new ArrayList<>();
  private int mN = 0;
  private int mM = -1;

  protected A388853(final Sequence num, final Sequence den) {
    mNum = num;
    mDen = den;
  }

  /** Construct the sequence. */
  public A388853() {
    this(new A038566().skip(), new A038567().skip());
  }

  private void step() {
    ++mT;
    final Q q = new Q(mNum.next(), mDen.next());
    for (int k = 0; k < mS.size(); ++k) {
      if (q.compareTo(mS.get(k)) > 0) {
        mS.set(k, q);
        mRows.get(k).add(mT);
        return;
      }
    }
    mS.add(q);
    final LinkedList<Long> lst = new LinkedList<>();
    lst.add(mT);
    mRows.add(lst);
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    while (mRows.size() <= mM || mRows.get(mM).isEmpty()) {
      step();
    }
    return Z.valueOf(mRows.get(mM).pollFirst());
  }
}

