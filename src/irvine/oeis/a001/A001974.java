package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

import java.util.TreeSet;

/**
 * A001974 Numbers that are the sum of 3 distinct squares, i.e., of the form <code>x^2 + y^2 + z^2</code> with <code>0 &lt;= x &lt; y &lt</code>; z.
 * @author Sean A. Irvine
 */
public class A001974 implements Sequence {

  private Z mX = Z.ZERO;
  private final TreeSet<Z> mSeq = new TreeSet<>();

  @Override
  public Z next() {
    while (mSeq.isEmpty() || mX.add(2).square().add(1).compareTo(mSeq.first()) <= 0) {
      final Z yl = mX.add(1);
      final Z zl = mX.add(2);
      final Z zs = zl.square();
      // deal with new max for z
      for (Z x = Z.ZERO; x.compareTo(mX) < 0; x = x.add(1)) {
        final Z a = zs.add(x.square());
        for (Z y = x.add(1); y.compareTo(yl) < 0; y = y.add(1)) {
          final Z b = a.add(y.square());
          mSeq.add(b);
        }
      }
      // deal with new max for y and x
      final Z ys = zs.add(yl.square());
      for (Z x = Z.ZERO; x.compareTo(mX) <= 0; x = x.add(1)) {
        final Z a = ys.add(x.square());
        mSeq.add(a);
      }
      mX = yl;
    }
    return mSeq.pollFirst();
  }
}
