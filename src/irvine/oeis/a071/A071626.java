package irvine.oeis.a071;

import java.util.HashSet;
import java.util.Set;

import irvine.factor.factor.PrimeDivision;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A071532.
 * @author Sean A. Irvine
 */
public class A071626 extends Sequence1 {

  private final FactorSequence mFactorSequence = new FactorSequence();
  private final PrimeDivision mFactor = new PrimeDivision();
  private long mN = 0;

  @Override
  public Z next() {
    mFactorSequence.add(++mN, FactorSequence.UNKNOWN, 1);
    mFactor.factor(mFactorSequence);
    final Set<Integer> exponents = new HashSet<>();
    for (final Z p : mFactorSequence.toZArray()) {
      exponents.add(mFactorSequence.getExponent(p));
    }
    return Z.valueOf(exponents.size());
  }
}
