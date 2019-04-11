package irvine.oeis.a002;

import java.util.HashSet;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002185 Smallest primitive factor of <code>2^(2n+1) + 1</code>.
 * @author Sean A. Irvine
 */
public class A002185 implements Sequence {

  private final HashSet<Z> mSeen = new HashSet<>();
  private int mN = -1;

  @Override
  public Z next() {
    mN += 2;
    if (mN == 3) {
      return Z.ONE;
    }
    final Z n = Z.ONE.shiftLeft(mN).add(1);
    final FactorSequence fs = Jaguar.factor(n);
    Z min = n;
    for (final Z p : fs.toZArray()) {
      if (mSeen.add(p) && p.compareTo(min) < 0) {
        min = p;
      }
    }
    return min;
  }
}
