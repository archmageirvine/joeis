package irvine.oeis.a091;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.FilterSequence;
import irvine.oeis.a005.A005101;

/**
 * A091191 Primitive abundant numbers: abundant numbers (A005101) having no abundant proper divisor.
 * @author Sean A. Irvine
 */
public class A091191 extends FilterSequence {

  /** Construct the sequence. */
  public A091191() {
    super(1, new A005101(), k -> {
      for (final Z d : Jaguar.factor(k).divisors()) {
        if (!d.equals(k) && !Z.ONE.equals(d) && Functions.SIGMA1.z(d).compareTo(d.multiply2()) > 0) {
          return false;
        }
      }
      return true;
    });
  }
}
