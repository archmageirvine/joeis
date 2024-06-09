package irvine.oeis.a011;

import irvine.math.cyclotomic.CyclotomicPolynomials;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A011632 28th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A011632 extends Sequence0 {

  private final int mN;
  private Z[] mA = null;
  private int mM = 0;

  private static Z[] build(final int n) {
    final Polynomial<Z> poly = CyclotomicPolynomials.cyclotomic(n);
    return poly.toArray(new Z[0]);
  }

  protected A011632(final int row) {
    mN = row;
  }

  /** Construct the sequence. */
  public A011632() {
    this(28);
  }

  @Override
  public Z next() {
    if (mA == null) {
      mA = build(mN);
    }
    return mM >= mA.length ? null : mA[mM++];
  }
}
