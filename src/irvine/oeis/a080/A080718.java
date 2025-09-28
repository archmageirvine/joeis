package irvine.oeis.a080;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.IntegerUtils;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a001.A001358;

/**
 * A080688.
 * @author Sean A. Irvine
 */
public class A080718 extends Sequence1 {

  private final Sequence mA = new A001358().prepend(1);

  private boolean is(final Z n) {
    if (n.isOne()) {
      return true;
    }
    if (n.mod(9) != 4) {
      return false;
    }
    final int[] cnts = ZUtils.digitCounts(n);
    final FactorSequence fs = Jaguar.factor(n);
    for (final Z p : fs.toZArray()) {
      final int e = fs.getExponent(p);
      final int[] c = ZUtils.digitCounts(p);
      for (int k = 0; k < c.length; ++k) {
        cnts[k] -= e * c[k];
        if (cnts[k] < 0) {
          return false;
        }
      }
    }
    return IntegerUtils.isZero(cnts);
  }

  @Override
  public Z next() {
    while (true) {
      final Z n = mA.next();
      if (is(n)) {
        return n;
      }
    }
  }
}
