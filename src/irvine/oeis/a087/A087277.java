package irvine.oeis.a087;

import irvine.math.z.Z;
import irvine.oeis.FilterNumberSequence;

/**
 * A087277 Numbers k such that the three second-degree cyclotomic polynomials x^2 + 1, x^2 - x + 1 and x^2 + x + 1 are simultaneously prime when evaluated at x=k.
 * @author Sean A. Irvine
 */
public class A087277 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A087277() {
    super(1, k -> {
      final Z k2 = Z.valueOf(k).square();
      return k2.add(1).isProbablePrime() && k2.subtract(k - 1).isProbablePrime() && k2.add(k + 1).isProbablePrime();
    });
  }
}
