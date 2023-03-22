package irvine.oeis.a262;

import java.util.ArrayList;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a062.A062204;

/**
 * A062204.
 * @author Sean A. Irvine
 */
public class A262809 extends Sequence0 {

  private int mN = -1;
  private int mM = 0;

  // Strictly we could do this sequence without memory, but it makes the indexing easier
  private final ArrayList<MemorySequence> mA = new ArrayList<>();

  protected Z t(final int n, final int m) {
    while (n >= mA.size()) {
      mA.add(MemorySequence.cachedSequence(new A062204(n)));
    }
    return mA.get(n).a(m);
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return t(mM, mN - mM);
  }
}

