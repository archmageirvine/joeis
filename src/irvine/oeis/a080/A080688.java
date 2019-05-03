package irvine.oeis.a080;

import irvine.math.z.Z;
import irvine.oeis.a064.A064553;
import irvine.util.array.DynamicIntArray;

/**
 * A080688 Resort the index of <code>A064553</code> using <code>A080444</code> and maintaining ascending order within each grouping: seen as a triangle read by rows, the n-th row contains the <code>A001055(n)</code> numbers m with <code>A064553(m)=n</code>.
 * @author Sean A. Irvine
 */
public class A080688 extends A080444 {

  private final DynamicIntArray mA = new DynamicIntArray();
  private final A064553 mSeq = new A064553();
  private int mFirstUnused = 0;

  private int index(final int y) {
    int pos = mFirstUnused;
    while (true) {
      int v = mA.get(++pos);
      if (v == 0) {
        final Z vv = mSeq.next();
        v = vv.intValueExact();
        mA.set(pos, v);
      }
      if (v == y) {
        if (pos == mFirstUnused + 1) {
          ++mFirstUnused;
        }
        mA.set(pos, -v);
        return pos;
      }
    }
  }

  @Override
  public Z next() {
    final Z yy = super.next();
    final int y = yy.intValueExact();
    return Z.valueOf(index(y));
  }
}
