package irvine.oeis.a001;

import java.util.ArrayList;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.memory.MemorySequence;

/**
 * A001624 Related to Latin rectangles.
 * @author Sean A. Irvine
 */
public class A001624 extends MemorySequence {

  {
    setOffset(2);
  }

  private int mN = -1;
  private int mGammaN = -1;
  protected Z mGamma = null;

  private final Sequence mDeltaSeq = new A001626();
  private final ArrayList<Z> mDelta = new ArrayList<>();

  private Z delta(final int n) {
    while (n >= mDelta.size()) {
      mDelta.add(mDeltaSeq.next());
    }
    return mDelta.get(n);
  }

  private final Sequence mEpsilonSeq = new A001627();
  private final ArrayList<Z> mEpsilon = new ArrayList<>();

  private Z epsilon(final int n) {
    while (n >= mEpsilon.size()) {
      mEpsilon.add(mEpsilonSeq.next());
    }
    return mEpsilon.get(n);
  }

  private Z gamma() {
    if (++mGammaN > 0) {
      mGamma = delta(mGammaN + 1).add(epsilon(mGammaN).multiply2()).add(a(mGammaN - 1).multiply(2L * mGammaN));
    } else {
      mGamma = Z.TWO;
    }
    return mGamma;
  }

  @Override
  protected Z computeNext() {
    if (++mN > 0) {
      return delta(mN + 1).add(delta(mN)).add(epsilon(mN)).add(a(mN - 1).add(gamma()).multiply(mN));
    }
    return Z.ONE;
  }

}

