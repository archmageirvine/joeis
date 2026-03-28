package irvine.oeis.a389;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a381.A381466;
import irvine.util.array.LongDynamicLongArray;

/**
 * A389105 a(n) is the smallest value of k such that gcd(A381466(k-1), k) = n.
 * @author Sean A. Irvine
 */
public class A389105 extends Sequence1 {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private final LongDynamicLongArray mFirsts = new LongDynamicLongArray();
  private final Sequence mA = new A381466();
  private int mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    ++mN;
    while (mFirsts.get(mN) == 0) {
      final long t = Functions.GCD.l(mA.next(), ++mM);
      if (mFirsts.get(t) == 0) {
        mFirsts.set(t, mM);
        if (mVerbose) {
          System.out.println("Solution for " + t + " is " + mM);
        }
      }
    }
    return Z.valueOf(mFirsts.get(mN));
  }
}
