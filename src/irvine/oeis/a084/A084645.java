package irvine.oeis.a084;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.FilterNumberSequence;

/**
 * A084645 Hypotenuses for which there exists a unique integer-sided right triangle.
 * @author Sean A. Irvine
 */
public class A084645 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A084645() {
    super(1, k -> {
      int cnt = 0;
      final FactorSequence fs = Jaguar.factor(k);
      for (final Z p : fs.toZArray()) {
        if (p.mod(4) == 1 && (++cnt > 1 || fs.getExponent(p) > 1)) {
          return false;
        }
      }
      return cnt == 1;
    });
  }
}
