package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

import java.util.TreeSet;

/**
 * A001983 Numbers that are the sum of 2 distinct squares: of form <code>x^2 +</code> y^2 with <code>0 &lt;= x &lt;</code> y.
 * @author Sean A. Irvine
 */
public class A001983 implements Sequence {

  private Z mX = Z.ZERO;
  private final TreeSet<Z> mSeq = new TreeSet<>();

  @Override
  public Z next() {
    while (mSeq.isEmpty() || mX.add(1).square().compareTo(mSeq.first()) <= 0) {
      final Z yl = mX.add(1);
      final Z ys = yl.square();
      // deal with new max for y and x
      for (Z x = Z.ZERO; x.compareTo(mX) <= 0; x = x.add(1)) {
        mSeq.add(ys.add(x.square()));
      }
      mX = yl;
    }
    return mSeq.pollFirst();
  }
}
