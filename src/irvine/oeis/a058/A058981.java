package irvine.oeis.a058;

import java.util.Iterator;
import java.util.LinkedList;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A058978.
 * @author Sean A. Irvine
 */
public class A058981 implements Sequence {

  private Z mA = null;
  private Z mB = null;
  private final LinkedList<Z> mList = new LinkedList<>();

  @Override
  public Z next() {
    if (mB == null) {
      if (mA == null) {
        mA = Z.ZERO;
        return Z.ZERO;
      }
      mB = Z.ONE;
      mList.add(Z.ONE);
      return Z.ONE;
    }
    final Z t = mA.add(mB);
    mA = mB;
    for (final Iterator<Z> it = mList.iterator(); it.hasNext();) {
      final Z u = it.next();
      final Z[] qr = t.divideAndRemainder(u);
      if (qr[1].isZero()) {
        it.remove();
        mB = qr[0];
        mList.add(mB);
        return mB;
      }
    }
    mB = t;
    mList.add(mB);
    return mB;
  }
}
