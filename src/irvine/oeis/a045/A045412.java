package irvine.oeis.a045;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A045412 a(1)=3; for n &gt; 1, a(n) = a(n-1) + 1 if n is already in the sequence, a(n) = a(n-1) + 3 otherwise.
 * @author Sean A. Irvine
 */
public class A045412 implements Sequence {

  private Z mN = Z.ONE;
  private Z mPrev = Z.THREE;
  private final TreeSet<Z> mS = new TreeSet<>();

  @Override
  public Z next() {
    if (mS.isEmpty()) {
      mS.add(Z.THREE);
      return Z.THREE;
    }
    mN = mN.add(1);
    mPrev = mPrev.add(mS.contains(mN) ? 1 : 3);
    mS.add(mPrev);
    return mPrev;
  }
}
