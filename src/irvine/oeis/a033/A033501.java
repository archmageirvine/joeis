package irvine.oeis.a033;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.a000.A000217;

/**
 * A033501 Almost-squares: m such that m/p(m) &gt;= k/p(k) for all k&lt;m, where p(m) is the least perimeter of a rectangle with integer side lengths and area m.
 * @author Sean A. Irvine
 */
public class A033501 extends A000217 {

  /** Construct the sequence. */
  public A033501() {
    super(1);
  }

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
