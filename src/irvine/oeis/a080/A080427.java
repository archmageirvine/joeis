package irvine.oeis.a080;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A080427 a(1)=1 and, for n&gt;1, a(n) is the smallest positive integer such that the absolute difference |a(n)-a(n-1)| has not occurred previously.
 * @author Sean A. Irvine
 */
public class A080427 extends Sequence1 {

  private final HashSet<Z> mDifferences = new HashSet<>();
  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
    } else {
      long k = 0;
      while (true) {
        final Z d = mA.subtract(++k).abs();
        if (mDifferences.add(d)) {
          mA = Z.valueOf(k);
          break;
        }
      }
    }
    return mA;
  }
}

