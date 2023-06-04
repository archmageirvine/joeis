package irvine.oeis.a063;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.a002.A002952;

/**
 * A063991 Unitary amicable numbers.
 * @author Sean A. Irvine
 */
public class A063991 extends A002952 {

  // Simple union does not work here because A002953 is not monotonic increasing
  private final TreeSet<Z> mA = new TreeSet<>();
  private Z mLower = super.next();

  @Override
  protected Z select(final Z n, final Z a) {
    mA.add(a);
    return n;
  }

  @Override
  public Z next() {
    while (mA.isEmpty() || mA.first().compareTo(mLower) >= 0) {
      mA.add(mLower);
      mLower = super.next();
    }
    return mA.pollFirst();
  }
}
