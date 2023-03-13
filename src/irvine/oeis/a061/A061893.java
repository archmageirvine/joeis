package irvine.oeis.a061;

import java.util.ArrayList;
import java.util.List;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A061859.
 * @author Sean A. Irvine
 */
public class A061893 extends Sequence0 {

  private final int[] mInitial;
  private List<Integer> mA = null;
  private int mM = 0;

  protected A061893(final int... initial) {
    mInitial = initial;
  }

  /** Construct the sequence. */
  public A061893() {
    this(1, 0, 0);
  }

  private List<Integer> play(final List<Integer> a) {
    final ArrayList<Integer> res = new ArrayList<>();
    for (int k = a.size() - 1, i = 1; k >= 0; --k, ++i) {
      final int cnt = a.get(k);
      for (int j = 0; j < cnt; ++j) {
        res.add(i);
      }
    }
    return res;
  }

  @Override
  public Z next() {
    if (mA == null) {
      mA = new ArrayList<>();
      for (final int v : mInitial) {
        mA.add(v);
      }
    } else if (++mM >= mA.size()) {
      mA = play(mA);
      mM = 0;
    }
    return Z.valueOf(mA.get(mM));
  }
}
