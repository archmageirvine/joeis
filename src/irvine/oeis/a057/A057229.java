package irvine.oeis.a057;

import java.util.TreeSet;

import irvine.math.LongUtils;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A057229 a(n) = a*b = x*y with (a-b) = (x+y) = A020882(n) (a&gt;b, a&gt;0, b&gt;0, x&gt;0, y&gt;0), gcd(a, b) = gcd(x, y) = 1.
 * @author Sean A. Irvine
 */
public class A057229 extends Sequence0 {

  private long mC = 4;
  private final TreeSet<Z> mA = new TreeSet<>();

  @Override
  public Z next() {
    while (mA.isEmpty()) {
      ++mC;
      for (long b = 1; b < mC; ++b) {
        if (LongUtils.gcd(mC, b) == 1) {
          final long a2 = mC * mC - b * b;
          final long a = Functions.SQRT.l(a2);
          if (a < b && a * a == a2 && LongUtils.gcd(a, mC) == 1 && LongUtils.gcd(a, b) == 1) {
            mA.add(Z.valueOf(a).multiply(b).divide2());
          }
        }
      }
    }
    return mA.pollFirst();
  }
}
