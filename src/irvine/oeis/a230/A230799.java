package irvine.oeis.a230;

import java.util.TreeSet;

import irvine.math.polynomial.CyclotomicPolynomials;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A230799 The number of distinct nonzero coefficients in the n-th cyclotomic polynomial.
 * @author Georg Fischer
 */
public class A230799 extends AbstractSequence {

  private int mN;
  private final TreeSet<Z> mSet = new TreeSet<>();

  /** Construct the sequence. */
  public A230799() {
    super(1);
    mN = 0;
  }

  @Override
  public Z next() {
    final Polynomial<Z> cyclo = CyclotomicPolynomials.cyclotomic(++mN);
    mSet.clear();
    for (int icoeff = cyclo.degree(); icoeff >= 0; --icoeff) {
      final Z co = cyclo.coeff(icoeff);
      if (!co.isZero()) {
        mSet.add(cyclo.coeff(icoeff));
      }
    }
    return Z.valueOf(mSet.size());
  }
}
