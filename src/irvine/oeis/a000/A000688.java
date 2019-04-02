package irvine.oeis.a000;

import java.util.ArrayList;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000688 Number of Abelian groups of order n; number of factorizations of n into prime powers.
 * @author Sean A. Irvine
 */
public class A000688 implements Sequence {

  private long mN = 0;
  private final ArrayList<Z> mPart = new ArrayList<>();
  private final A000041 mP = new A000041();

  protected Z p(final int n) {
    while (n >= mPart.size()) {
      mPart.add(mP.next());
    }
    return mPart.get(n);
  }

  @Override
  public Z next() {
    final FactorSequence fs = Cheetah.factor(++mN);
    Z r = Z.ONE;
    for (final Z p : fs.toZArray()) {
      r = r.multiply(p(fs.getExponent(p)));
    }
    return r;
  }
}
