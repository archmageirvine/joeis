package irvine.oeis.a027;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.FiniteSequence;

/**
 * A027894 Divisors of 9999.
 * @author Georg Fischer
 */
public class A027894 extends FiniteSequence {

  /** Construct the sequence. */
  public A027894() {
    this(10, 4);
  }

  /**
   * Generic constructor with parameters
   * @param base base number
   * @param power power of <code>base</code>
   */
  public A027894(final int base, final int power) {
    super(1, FINITE, Jaguar.factor(Z.valueOf(base).pow(power).subtract(1)).divisorsSorted());
  }
}
