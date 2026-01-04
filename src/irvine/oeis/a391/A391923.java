package irvine.oeis.a391;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.FilterSequence;
import irvine.oeis.a052.A052486;

/**
 * A391923 allocated for Michael De Vlieger.
 * @author Sean A. Irvine
 */
public class A391923 extends FilterSequence {

  /** Construct the sequence. */
  public A391923() {
    super(1, new A052486(), k -> {
      final FactorSequence fs = Jaguar.factor(k);
      if (fs.maxExponent() < 3) {
        return true;
      }
      int cnt = 0;
      for (final Z p : fs.toZArray()) {
        if (fs.getExponent(p) >= 3 && ++cnt > 1) {
          return false;
        }
      }
      return true;
    });
  }
}
