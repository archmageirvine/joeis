package irvine.oeis.a086;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.FilterNumberSequence;

/**
 * A086982 Numbers n such that 10^n+1 is not squarefree.
 * @author Sean A. Irvine
 */
public class A086982 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A086982() {
    super(1, k -> {
      if (k >= 28299156) {
        throw new UnsupportedOperationException();
      }
      return (k % 243 == 0 && ((k / 243) & 1) == 1) || !Functions.GCD.z(Z.TEN.pow(k).add(1), k).isOne();
    });
  }
}
