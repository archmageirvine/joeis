package irvine.oeis.a394;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.FilterNumberSequence;

/**
 * A394579 allocated for Boaz Cohen.
 * @author Sean A. Irvine
 */
public class A394579 extends FilterNumberSequence {

  // After Michel Marcus

  /** Construct the sequence. */
  public A394579() {
    super(1, 2, m -> {
      if (m == 2 || m == 4) {
        return true;
      }
      final FactorSequence fs = Jaguar.factor(m);
      final boolean odd = (m & 1) == 1;
      if (!odd && fs.getExponent(fs.leastPrimeFactor()) > 2) {
        return false;
      }
      final Z[] p = fs.toZArray();
      for (int i = odd ? 0 : 1; i < p.length; ++i) {
        if (p[i].mod(4) != 3) {
          return false;
        }
        if (fs.getExponent(p[i]) > 2) {
          return false;
        }
      }
      return true;
    });
  }
}
