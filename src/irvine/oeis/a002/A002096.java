package irvine.oeis.a002;

import java.util.List;
import java.util.ArrayList;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000607;

/**
 * A002096 Mixed partitions of <code>n</code>.
 * @author Sean A. Irvine
 */
public class A002096 implements Sequence {

  private final A000607 mPrime = new A000607();
  private final A002095 mComposite = new A002095();
  private final List<Z> mQ = new ArrayList<>();
  private final List<Z> mR = new ArrayList<>();
  private int mN = 0;

  {
    mQ.add(mPrime.next());
    mR.add(mComposite.next());
  }

  @Override
  public Z next() {
    mQ.add(mPrime.next());
    mR.add(mComposite.next());
    ++mN;
    Z s = Z.ZERO;
    for (int k = 1; k < mN; ++k) {
      s = s.add(mR.get(k).multiply(mQ.get(mN - k)));
    }
    return s;
  }
}
