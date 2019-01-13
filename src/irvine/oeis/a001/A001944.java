package irvine.oeis.a001;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001944.
 * @author Sean A. Irvine
 */
public class A001944 implements Sequence {

  private Z mW = init();
  private final TreeSet<Z> mSeq = new TreeSet<>();

  protected Z init() {
    return Z.ZERO;
  }

  @Override
  public Z next() {
    while (mSeq.isEmpty() || mW.add(3).square().add(5).compareTo(mSeq.first()) <= 0) {
      final Z xl = mW.add(1);
      final Z yl = mW.add(2);
      final Z zl = mW.add(3);
      final Z zs = zl.square();
      // deal with new max for z
      for (Z w = init(); w.compareTo(mW) < 0; w = w.add(1)) {
        final Z a = zs.add(w.square());
        for (Z x = w.add(1); x.compareTo(xl) < 0; x = x.add(1)) {
          final Z b = a.add(x.square());
          for (Z y = x.add(1); y.compareTo(yl) < 0; y = y.add(1)) {
            final Z c = b.add(y.square());
            mSeq.add(c);
          }
        }
      }
      // deal with new max for y
      final Z ys = zs.add(yl.square());
      for (Z w = init(); w.compareTo(mW) < 0; w = w.add(1)) {
        final Z a = ys.add(w.square());
        for (Z x = w.add(1); x.compareTo(xl) < 0; x = x.add(1)) {
          final Z b = a.add(x.square());
          mSeq.add(b);
        }
      }
      // deal with new max for x and w
      final Z xs = ys.add(xl.square());
      for (Z w = init(); w.compareTo(mW) <= 0; w = w.add(1)) {
        final Z a = xs.add(w.square());
        mSeq.add(a);
      }
      mW = xl;
    }
    return mSeq.pollFirst();
  }
}
