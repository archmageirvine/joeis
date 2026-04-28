package irvine.oeis.a084;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.FilterNumberSequence;

/**
 * A084647 Hypotenuses for which there exist exactly 3 distinct integer triangles.
 * @author Sean A. Irvine
 */
public class A084647 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A084647() {
    super(1, k -> {
      int cnt = 0;
      final FactorSequence fs = Jaguar.factor(k);
      for (final Z p : fs.toZArray()) {
        if (p.mod(4) == 1 && (++cnt > 1 || fs.getExponent(p) != 3)) {
          return false;
        }
      }
      return cnt == 1;
    });
  }
}
