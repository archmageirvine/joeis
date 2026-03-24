package irvine.oeis.a392;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.FilterSequence;
import irvine.oeis.a390.A390949;

/**
 * A392926 allocated for Michael De Vlieger.
 * @author Sean A. Irvine
 */
public class A392926 extends FilterSequence {

  /** Construct the sequence. */
  public A392926() {
    super(1, new A390949(), k -> {
      final FactorSequence fs = Jaguar.factor(k);
      for (final Z p : fs.toZArray()) {
        final int ep = fs.getExponent(p);
        for (final Z q : fs.toZArray()) {
          if (p.equals(q)) {
            break;
          }
          if (ep == fs.getExponent(q)) {
            return true;
          }
        }
      }
      return false;
    });
  }
}
