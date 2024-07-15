package irvine.oeis.a071;

import java.util.HashMap;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A071291.
 * @author Sean A. Irvine
 */
public class A071364 extends Sequence1 {

  private final HashMap<String, Long> mFirsts = new HashMap<>();
  private long mN = 0;

  @Override
  public Z next() {
    final FactorSequence fs = Jaguar.factor(++mN);
    final StringBuilder key = new StringBuilder();
    for (final Z p : fs.toZArray()) {
      key.append(fs.getExponent(p)).append(',');
    }
    return Z.valueOf(mFirsts.computeIfAbsent(key.toString(), s -> mN));
  }
}
