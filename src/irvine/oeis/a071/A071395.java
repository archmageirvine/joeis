package irvine.oeis.a071;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.FilterSequence;
import irvine.oeis.a005.A005101;

/**
 * A071395 Primitive abundant numbers (abundant numbers all of whose proper divisors are deficient numbers).
 * @author Sean A. Irvine
 */
public class A071395 extends FilterSequence {

  /** Construct the sequence. */
  public A071395() {
    super(1, new A005101(), k -> {
      for (final Z d : Jaguar.factor(k).divisors()) {
        if (!d.equals(k) && !Z.ONE.equals(d) && Functions.SIGMA1.z(d).compareTo(d.multiply2()) >= 0) {
          return false;
        }
      }
      return true;
    });
  }
}
