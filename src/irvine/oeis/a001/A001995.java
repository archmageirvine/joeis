package irvine.oeis.a001;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001995 Numbers that are the sum of 5 distinct squares: of form <code>v^2 + w^2 + x^2 + y^2 + z^2</code> with <code>0 &lt;= v &lt; w &lt; x &lt; y &lt; z</code>.
 * @author Sean A. Irvine
 */
public class A001995 implements Sequence {

  private Z mV = init();
  private final TreeSet<Z> mSeq = new TreeSet<>();

  protected Z init() {
    return Z.ZERO;
  }

  @Override
  public Z next() {
    while (mSeq.isEmpty() || mV.add(4).square().add(14).compareTo(mSeq.first()) <= 0) {
      final Z wl = mV.add(1);
      final Z xl = mV.add(2);
      final Z yl = mV.add(3);
      final Z zl = mV.add(4);
      final Z zs = zl.square();
      // deal with new max for z
      for (Z v = init(); v.compareTo(mV) < 0; v = v.add(1)) {
        final Z vs = zs.add(v.square());
        for (Z w = v.add(1); w.compareTo(wl) < 0; w = w.add(1)) {
          final Z a = vs.add(w.square());
          for (Z x = w.add(1); x.compareTo(xl) < 0; x = x.add(1)) {
            final Z b = a.add(x.square());
            for (Z y = x.add(1); y.compareTo(yl) < 0; y = y.add(1)) {
              final Z c = b.add(y.square());
              mSeq.add(c);
            }
          }
        }
      }
      // deal with new max for y
      final Z ys = zs.add(yl.square());
      for (Z v = init(); v.compareTo(mV) < 0; v = v.add(1)) {
        final Z vs = ys.add(v.square());
        for (Z w = v.add(1); w.compareTo(wl) < 0; w = w.add(1)) {
          final Z a = vs.add(w.square());
          for (Z x = w.add(1); x.compareTo(xl) < 0; x = x.add(1)) {
            final Z b = a.add(x.square());
            mSeq.add(b);
          }
        }
      }
      // deal with new max for x
      final Z xs = ys.add(xl.square());
      for (Z v = init(); v.compareTo(mV) < 0; v = v.add(1)) {
        final Z vs = xs.add(v.square());
        for (Z w = v.add(1); w.compareTo(wl) < 0; w = w.add(1)) {
          final Z a = vs.add(w.square());
          mSeq.add(a);
        }
      }
      // deal with new max for w and v
      final Z ws = xs.add(wl.square());
      for (Z v = init(); v.compareTo(mV) <= 0; v = v.add(1)) {
        final Z a = ws.add(v.square());
        mSeq.add(a);
      }
      mV = wl;
    }
    return mSeq.pollFirst();
  }
}
