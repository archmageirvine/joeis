package irvine.oeis.a036;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.a003.A003136;

/**
 * A036558 Squared distances that can arise in any Barlow packing of spheres of diameter sqrt(3) (the scale being the simplest one that makes this an integer sequence).
 * @author Sean A. Irvine
 */
public class A036558 extends A003136 {

  /** Construct the sequence. */
  public A036558() {
    super(0);
  }

  private final TreeSet<Z> mA = new TreeSet<>();

  {
    mA.add(super.next());
  }

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (mN.compareTo(mA.last()) > 0) {
        mA.add(super.next());
      }
      if (mA.contains(mN) && mN.mod(3) == 0) {
        // i.e. z == 0, n == 3k
        return mN;
      }
      if (mA.contains(mN.subtract(2)) && mN.mod(3) == 0) {
        // i.e. z == 1, n == 3k
        return mN;
      }
      Z u;
      for (long z = 2; (u = mN.subtract(Z.valueOf(z).square().multiply2())).signum() >= 0; ++z) {
        if (mA.contains(u)) {
          return mN;
        }
      }
    }
  }
}
