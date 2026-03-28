package irvine.oeis.a392;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.FilterSequence;
import irvine.oeis.a393.A393708;

/**
 * A392927 Achilles numbers k with at least 1 repeated exponent of prime power factors.
 * @author Sean A. Irvine
 */
public class A392927 extends FilterSequence {

  /** Construct the sequence. */
  public A392927() {
    super(1, new A393708(), k -> {
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
