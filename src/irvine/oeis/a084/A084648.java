package irvine.oeis.a084;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.FilterNumberSequence;

/**
 * A084648 Hypotenuses for which there exist exactly 4 distinct integer triangles.
 * @author Sean A. Irvine
 */
public class A084648 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A084648() {
    super(1, k -> {
      int cnt = 0;
      int mul = 0;
      final FactorSequence fs = Jaguar.factor(k);
      for (final Z p : fs.toZArray()) {
        if (p.mod(4) == 1) {
          mul += fs.getExponent(p);
          if (++cnt > 2) {
            return false;
          }
        }
      }
      return (cnt == 2 && mul == 2) || (cnt == 1 && mul == 4);
    });
  }
}
