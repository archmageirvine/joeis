package irvine.oeis.a046;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000959;
import irvine.oeis.a007.A007504;

/**
 * A046285 Numbers k such that the sum of the first k primes is a lucky number.
 * @author Sean A. Irvine
 */
public class A046285 extends A007504 {

  private Z mN = Z.ZERO;
  private final Sequence mLucky = new A000959();
  private final TreeSet<Z> mL = new TreeSet<>();
  {
    super.next(); // skip 0
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
      if (isLucky(super.next())) {
        return mN;
      }
    }
  }
}
