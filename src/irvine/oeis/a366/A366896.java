package irvine.oeis.a366;

import java.util.HashSet;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A366896 a(n) is the least positive integer not already in the sequence with the property that the concatenation a(0)a(1)...a(n) forms an integer with n distinct prime factors.
 * @author Sean A. Irvine
 */
public class A366896 extends Sequence0 {

  private final HashSet<Long> mUsed = new HashSet<>();
  private Z mA = Z.ZERO;
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    long t = 1;
    long k = 0;
    while (true) {
      if (++k == t) {
        mA = mA.multiply(10);
        t *= 10;
      }
      if (!mUsed.contains(k) && Functions.OMEGA.i(mA.add(k)) == mN) {
        mA = mA.add(k);
        mUsed.add(k);
        return Z.valueOf(k);
      }
    }
  }
}
