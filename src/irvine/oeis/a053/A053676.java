package irvine.oeis.a053;

import java.util.Iterator;
import java.util.LinkedHashSet;

import irvine.math.z.Z;
import irvine.oeis.a005.A005900;

/**
 * A053676.
 * @author Sean A. Irvine
 */
public class A053676 extends A005900 {

  private final LinkedHashSet<Z> mA = new LinkedHashSet<>();
  private Z mPrev = Z.ONE;
  private long mOffset = 0;
  {
    super.next(); // skip 0
    mA.add(super.next());
  }

  private Z update() {
    // Drops low terms from memory when they will never be used again
    final Z t = super.next();
    final Z delta = t.subtract(mPrev);
    for (final Iterator<Z> it = mA.iterator(); it.hasNext();) {
      final Z u = it.next();
      if (u.compareTo(delta) >= 0) {
        break;
      }
      it.remove();
      ++mOffset;
    }
    mA.add(t);
    mPrev = t;
    return t;
  }

  @Override
  public Z next() {
    while (true) {
      final Z t = update();
      for (final Z u : mA) {
        final Z v = t.subtract(u);
        if (v.compareTo(u) < 0) {
          break;
        }
        if (mA.contains(v)) {
          //StringUtils.message(mA.size() + " " + mOffset);
          return Z.valueOf(mOffset + mA.size());
        }
      }
    }
  }
}
