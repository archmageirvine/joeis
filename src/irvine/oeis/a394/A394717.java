package irvine.oeis.a394;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.FilterSequence;
import irvine.oeis.a002.A002808;

/**
 * A394717 Composite numbers d such that the period k of the decimal expansion of 1/d is even and divides d-1, and the two halves of the repetend of 1/d sum to 10^(k/2) - 1.
 * @author Sean A. Irvine
 */
public class A394717 extends FilterSequence {

  /** Construct the sequence. */
  public A394717() {
    super(1, new A002808(), d -> {
      Z dr = d.makeOdd();
      while (dr.mod(5) == 0) {
        dr = dr.divide(5);
      }
      if (dr.isOne()) {
        return false;
      }
      final long k = Functions.ORDER.l(dr, 10);
      return (k & 1) == 0 && d.subtract(1).mod(k) == 0 && Z.TEN.modPow(k / 2, dr).equals(dr.subtract(1));
    });
  }
}
