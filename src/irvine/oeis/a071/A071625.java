package irvine.oeis.a071;

import java.util.HashSet;
import java.util.Set;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A071532.
 * @author Sean A. Irvine
 */
public class A071625 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final FactorSequence fs = Jaguar.factor(++mN);
    final Set<Integer> exponents = new HashSet<>();
    for (final Z p : fs.toZArray()) {
      exponents.add(fs.getExponent(p));
    }
    return Z.valueOf(exponents.size());
  }
}
