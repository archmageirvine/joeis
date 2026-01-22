package irvine.oeis.a083;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.FilterSequence;

/**
 * A083394 Terms of A083393 such that the sum of the factorials of the digits is prime.
 * @author Sean A. Irvine
 */
public class A083394 extends FilterSequence {

  /** Construct the sequence. */
  public A083394() {
    super(new A083393(), k -> {
      Z sum = Z.ZERO;
      Z t = k;
      while (!t.isZero()) {
        final Z[] qr = t.divideAndRemainder(Z.TEN);
        sum = sum.add(Functions.FACTORIAL.z(qr[1]));
        t = qr[0];
      }
      return sum.isProbablePrime();
    });
  }
}
