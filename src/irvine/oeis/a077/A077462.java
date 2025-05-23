package irvine.oeis.a077;

import java.util.HashMap;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A077459.
 * @author Sean A. Irvine
 */
public class A077462 extends Sequence0 {

  private long mN = -1;
  private int mM = 0;
  private final HashMap<String, Integer> mMap = new HashMap<>();

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ZERO;
    }
    final StringBuilder sb = new StringBuilder();
    final FactorSequence fs = Jaguar.factor(mN);
    for (final Z p : fs.toZArray()) {
      sb.append(fs.getExponent(p)).append(',');
    }
    return Z.valueOf(mMap.computeIfAbsent(sb.toString(), key -> ++mM));
  }
}
