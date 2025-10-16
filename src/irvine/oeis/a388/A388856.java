package irvine.oeis.a388;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.function.Function;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A388856 Increasing partition array based on the sequence (sin(n)); see Comments.
 * @author Sean A. Irvine
 */
public class A388856 extends Sequence1 {

  private final Function<Long, CR> mLambda;
  private long mT = 0;
  private final ArrayList<CR> mS = new ArrayList<>();
  private final ArrayList<LinkedList<Long>> mRows = new ArrayList<>();
  private int mN = 0;
  private int mM = -1;
  private long mR = 0;

  protected A388856(final Function<Long, CR> f) {
    mLambda = f;
  }

  /** Construct the sequence. */
  public A388856() {
    this(n -> CR.valueOf(n).sin());
  }

  private void step() {
    ++mT;
    final CR f = mLambda.apply(++mR);
    for (int k = 0; k < mS.size(); ++k) {
      if (f.compareTo(mS.get(k)) > 0) {
        mS.set(k, f);
        mRows.get(k).add(mT);
        return;
      }
    }
    mS.add(f);
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

