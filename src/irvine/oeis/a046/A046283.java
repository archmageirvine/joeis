package irvine.oeis.a046;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000959;

/**
 * A046283 Lucky numbers k such that the sum of the lucky numbers &lt;= k is prime.
 * @author Sean A. Irvine
 */
public class A046283 extends A046279 {

  private Z mN = Z.ZERO;
  private final Sequence mLucky = new A000959();
  private final TreeSet<Z> mL = new TreeSet<>();
  {
    mL.add(mLucky.next());
  }

  private boolean isLucky(final Z n) {
    while (mL.last().compareTo(n) < 0) {
      mL.add(mLucky.next());
    }
    return mL.contains(n);
  }

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (super.next().isProbablePrime() && isLucky(mN)) {
        return mN;
      }
    }
  }
}
