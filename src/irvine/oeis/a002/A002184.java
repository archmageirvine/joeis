package irvine.oeis.a002;

import java.util.HashSet;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002184 a(n) = least primitive factor of 2^(2n+1) - 1.
 * @author Sean A. Irvine
 */
public class A002184 implements Sequence {

  private final HashSet<Z> mSeen = new HashSet<>();
  private int mN = -1;

  @Override
  public Z next() {
    mN += 2;
    final Z n = Z.ONE.shiftLeft(mN).subtract(1);
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
