package irvine.oeis.a160;

import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.AbstractSequence;

/**
 * A160338 Height (maximum absolute value of coefficients) of the n-th cyclotomic polynomial.
 * @author Georg Fischer
 */
public class A160338 extends AbstractSequence {

  private int mN = 0;

  /** Construct the sequence. */
  public A160338() {
    super(1);
  }

  /**
   * Return the maximum absolute value of the coefficients of a poylnomial.
   * @param poly polynomial
   * @return height
   */
  public static Z height(Polynomial<Z> poly) {
    Z h = Z.ZERO;
    for (final Z c : poly) {
      final Z cabs = c.abs();
      if (cabs.compareTo(h) > 0) {
        h = cabs;
      }
    }
    return h;
  }

  @Override
  public Z next() {
    return height(Cyclotomic.cyclotomic(++mN));
  }
}
