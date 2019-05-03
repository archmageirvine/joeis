package irvine.oeis.a003;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003136 Loeschian numbers: numbers of the form <code>x^2 +</code> xy <code>+ y^2</code>; norms of vectors in <code>A2</code> lattice.
 * @author Sean A. Irvine
 */
public class A003136 implements Sequence {

  private final TreeSet<Z> mPriority = new TreeSet<>();
  private Z mXLast = Z.NEG_ONE;
  private Z mLimit = Z.ZERO;

  @Override
  public Z next() {
    while (mPriority.isEmpty() || mPriority.first().compareTo(mLimit) > 0) {
      mXLast = mXLast.add(1);
      mLimit = mXLast.square();
      final Z lim3 = mLimit.multiply(3);
      for (Z k = Z.ZERO; k.compareTo(mXLast) <= 0; k = k.add(1)) {
        final Z kk = k.square();
        mPriority.add(mLimit.add(kk.multiply(3)));
        mPriority.add(lim3.add(kk));
      }
    }
    return mPriority.pollFirst();
  }
}

