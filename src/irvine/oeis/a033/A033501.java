package irvine.oeis.a033;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.a000.A000217;

/**
 * A033501 <code>Almost-squares</code>: m such that <code>m/p(m) &gt;= k/p(k)</code> for all k&lt;m, where <code>p(m)</code> is the least perimeter of a rectangle with integer side lengths and area m.
 * @author Sean A. Irvine
 */
public class A033501 extends A000217 {

  private final TreeSet<Z> mSet = new TreeSet<>();
  private Z mN = Z.ZERO;
  private long mT = 0;
  private Z mTriangle = super.next();

  @Override
  public Z next() {
    while (mSet.isEmpty() || mSet.first().compareTo(mN.square()) >= 0) {
      mN = mN.add(1);
      while (mTriangle.compareTo(mN) <= 0) {
        ++mT;
        mTriangle = super.next();
      }
      for (long h = 0; h <= mT; ++h) {
        mSet.add(mN.multiply(mN.add(h)));
      }
    }
    return mSet.pollFirst();
  }
}
