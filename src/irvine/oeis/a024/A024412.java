package irvine.oeis.a024;

import java.util.TreeSet;

import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A024412 Ordered Stirling numbers <code>s(n,k)</code> of the second kind.
 * @author Sean A. Irvine
 */
public class A024412 implements Sequence {

  private final TreeSet<Z> mA = new TreeSet<>();
  {
    mA.add(Z.ZERO);
    mA.add(Z.ONE);
  }
  private long mN = 1;
  private Z mLimit = Z.ONE;

  @Override
  public Z next() {
    final Z res = mA.pollFirst();
    if (res.equals(mLimit)) {
      // Insert next row
      // The second smallest Stirling number of the second kind in a row is a triangular number
      // (the smallest is 1 and we ignore that)
      mLimit = Z.valueOf(++mN).multiply(mN + 1).divide2();
      for (long k = 2; k <= mN; ++k) {
        mA.add(Stirling.secondKind(mN + 1, k));
      }
    }
    return res;
  }
}
