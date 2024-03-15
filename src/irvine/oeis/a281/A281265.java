package irvine.oeis.a281;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.a007.A007992;

/**
 * A281265 Variation on betrothed numbers.
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A281265 extends A007992 {

  private final TreeSet<Z> mA = new TreeSet<>();
  private Z mLastSmall = super.next();

  @Override
  protected Z select(final Z small, final Z big) {
    mA.add(small);
    mA.add(big);
    return small;
  }

  @Override
  public Z next() {
    if (mLastSmall.compareTo(mA.first()) >= 0) {
      return mA.pollFirst();
    }
    mLastSmall = super.next();
    return mA.pollFirst();
  }
}
